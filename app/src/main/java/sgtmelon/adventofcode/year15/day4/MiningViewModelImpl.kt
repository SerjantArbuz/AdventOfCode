package sgtmelon.adventofcode.year15.day4

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.Flow
import sgtmelon.adventofcode.staff.utils.flowOnBack
import sgtmelon.adventofcode.year15.day4.model.HashState
import sgtmelon.adventofcode.year15.day4.useCase.GetHexUseCase
import sgtmelon.adventofcode.year15.day4.useCase.GetMD5UseCase

class MiningViewModelImpl(
    private val input: String,
    private val getMD5: GetMD5UseCase,
    private val getHex: GetHexUseCase
) : ViewModel(),
    MiningViewModel {

    override val firstValue: Flow<HashState> get() = getHash(FIRST_PREFIX)

    override fun getSecondValue(firstResult: HashState.Result): Flow<HashState> {
        return getHash(SECOND_PREFIX, firstResult.iteration)
    }

    /**
     * [mineStart] needs for time optimization. We knows on 100% what [getSecondValue] hash
     * will be after last iteration of [firstValue] hash.
     */
    private fun getHash(prefix: String, mineStart: Long = 0L): Flow<HashState> = flowOnBack {
        var hash: String
        var i = mineStart

        do {
            hash = getHex(getMD5(input.plus(++i)))
            emit(HashState.Iteration(i, hash))
        } while (!hash.startsWith(prefix))

        emit(HashState.Result(i, hash))
    }

    companion object {
        private const val FIRST_PREFIX = "00000"
        private const val SECOND_PREFIX = "000000"
    }
}