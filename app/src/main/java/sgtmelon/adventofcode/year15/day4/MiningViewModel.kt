package sgtmelon.adventofcode.year15.day4

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import kotlinx.coroutines.flow.Flow
import sgtmelon.adventofcode.staff.parent.textSolution.TextSolutionViewModel
import sgtmelon.adventofcode.staff.utils.flowOnBack
import sgtmelon.adventofcode.year15.day4.useCase.GetHexUseCase
import sgtmelon.adventofcode.year15.day4.useCase.GetMD5UseCase

class MiningViewModel(
    private val input: String,
    private val getMD5: GetMD5UseCase,
    private val getHex: GetHexUseCase
) : ViewModel(),
    TextSolutionViewModel {

    override val firstValue: LiveData<String> = getHash(prefix = "00000").asLiveData()

    override val secondValue: LiveData<String> = getHash(prefix = "000000").asLiveData()

    private fun getHash(prefix: String): Flow<String> = flowOnBack {
        var hash = ""
        var i = 0L

        do {
            hash = getHex(getMD5(input.plus(++i)))
            emit(formatHash(hash, i))
        } while (!hash.startsWith(prefix))

        emit(formatHash(hash, i))
    }

    private fun formatHash(hash: String, iteration: Long): String = "$iteration\n$hash"

}