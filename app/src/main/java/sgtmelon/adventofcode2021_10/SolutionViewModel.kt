package sgtmelon.adventofcode2021_10

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import sgtmelon.adventofcode2021_10.model.LineType
import sgtmelon.adventofcode2021_10.useCase.GetLineTypeUseCase
import sgtmelon.adventofcode2021_10.useCase.SplitTextUseCase

class SolutionViewModel(
    private val splitText: SplitTextUseCase,
    private val getLineType: GetLineTypeUseCase
) : ViewModel() {

    fun getResult(input: String): Flow<Int> = flow {
        val lineList = splitText(input)

        var totalPoints = 0
        for (line in lineList) {
            when (val lineType = getLineType(line)) {
                is LineType.Corrupted -> totalPoints += lineType.bracket.point
                is LineType.Incomplete -> continue
            }
        }

        emit(totalPoints)
    }.flowOn(Dispatchers.IO)

}