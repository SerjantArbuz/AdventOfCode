package sgtmelon.adventofcode.year15.day4

import kotlinx.coroutines.flow.Flow
import sgtmelon.adventofcode.year15.day4.model.HashState

interface MiningViewModelInterface {

    val firstValue: Flow<HashState>

    fun getSecondValue(firstResult: HashState.Result): Flow<HashState>

}