package sgtmelon.adventofcode2021_10

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class SolutionViewModel : ViewModel() {

    fun getResult(input: String): Flow<Int> = flow {
        emit(0)
    }.flowOn(Dispatchers.IO)

}