package sgtmelon.adventofcode.year15.day8

import sgtmelon.adventofcode.app.domain.SplitTextUseCase
import sgtmelon.adventofcode.app.presentation.screen.parent.solution.TextSolutionViewModelImpl
import sgtmelon.adventofcode.year15.day8.useCase.GetStringLengthUseCase

class Year15Day8ViewModel(
    private val input: String,
    private val splitText: SplitTextUseCase,
    private val getStringLength: GetStringLengthUseCase
) : TextSolutionViewModelImpl() {

    override suspend fun calculatePuzzle() {
        val list = splitText(input)

        val answer = list.sumOf {
            val (length, escaped) = getStringLength(it)
            return@sumOf length - escaped
        }

        firstValue.postValue(answer.toString())
        secondValue.postValue("2")
    }
}