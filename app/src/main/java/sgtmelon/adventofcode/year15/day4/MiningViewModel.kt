package sgtmelon.adventofcode.year15.day4

import sgtmelon.adventofcode.staff.parent.textSolution.TextSolutionViewModelImpl
import sgtmelon.adventofcode.year15.day4.useCase.GetHexUseCase
import sgtmelon.adventofcode.year15.day4.useCase.GetMD5UseCase

class MiningViewModel(
    private val input: String,
    private val getMD5: GetMD5UseCase,
    private val getHex: GetHexUseCase
) : TextSolutionViewModelImpl() {

    override suspend fun calculatePuzzle() {

        var hash = ""
        var i = 0
        do {
            hash = getHex(getMD5(input.plus(++i)))
        } while (!hash.startsWith(prefix = "000000"))

        firstValue.postValue(i.toString())
        secondValue.postValue(hash)
    }
}