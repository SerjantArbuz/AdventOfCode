package sgtmelon.adventofcode2021_10

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import sgtmelon.adventofcode2021_10.useCase.GetIllegalCharUseCase
import sgtmelon.adventofcode2021_10.useCase.SplitTextUseCase

class SolutionViewModel(
    private val splitText: SplitTextUseCase,
    private val getIllegalChar: GetIllegalCharUseCase
) : ViewModel() {

    fun getResult(input: String): Flow<Int> = flow {
        val lineList = splitText(input)

        var totalPoints = 0
        for (line in lineList) {
            val bracket = getIllegalChar(line)
            if (bracket != null) {
                totalPoints += bracket.point
            }
        }

        emit(totalPoints)
    }.flowOn(Dispatchers.IO)

}