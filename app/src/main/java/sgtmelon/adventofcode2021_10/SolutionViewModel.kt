package sgtmelon.adventofcode2021_10

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import sgtmelon.adventofcode2021_10.useCase.SplitTextUseCase

class SolutionViewModel(
    private val splitText: SplitTextUseCase
) : ViewModel() {

    fun getResult(input: String): Flow<Int> = flow {
        val inputList = splitText(input)




        emit(inputList.size)
    }.flowOn(Dispatchers.IO)

}