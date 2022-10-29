package sgtmelon.adventofcode2021_10

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import sgtmelon.adventofcode2021_10.useCase.IsLineFullUseCase
import sgtmelon.adventofcode2021_10.useCase.SplitTextUseCase

class SolutionViewModel(
    private val splitText: SplitTextUseCase,
    private val isLineFull: IsLineFullUseCase
) : ViewModel() {

    fun getResult(input: String): Flow<Int> = flow {
        val lineList = splitText(input)

        for (line in lineList) {
            if (!isLineFull(line)) continue
        }

        emit(lineList.size)
    }.flowOn(Dispatchers.IO)

}