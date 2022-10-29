package sgtmelon.adventofcode2021_10

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import sgtmelon.adventofcode2021_10.useCase.GetIllegalCharUseCase
import sgtmelon.adventofcode2021_10.useCase.IsLineFullUseCase
import sgtmelon.adventofcode2021_10.useCase.SplitTextUseCase

class SolutionViewModel(
    private val splitText: SplitTextUseCase,
    private val isLineFull: IsLineFullUseCase,
    private val getIllegalChar: GetIllegalCharUseCase
) : ViewModel() {

    fun getResult(input: String): Flow<Int> = flow {
        val lineList = splitText(input)

        for (line in lineList) {
            if (!isLineFull(line)) continue

            Log.i("HERE", "---")
            val bracket = getIllegalChar(line)
            Log.i("HERE", "line: $line | bracket: ${bracket?.char}")
        }

        emit(lineList.size)
    }.flowOn(Dispatchers.IO)

}