package sgtmelon.adventofcode.year15.day9

import android.util.ArraySet
import android.util.Log
import sgtmelon.adventofcode.app.domain.SplitTextUseCase
import sgtmelon.adventofcode.app.presentation.screen.parent.solution.TextSolutionViewModelImpl
import sgtmelon.adventofcode.year15.day9.useCase.GetUniqueSequencesUseCase
import sgtmelon.adventofcode.year15.day9.useCase.ParseDistanceUseCase

class Year15Day9ViewModel(
    private val input: String,
    private val splitText: SplitTextUseCase,
    private val parseDistance: ParseDistanceUseCase,
    private val getUniqueSequences: GetUniqueSequencesUseCase
) : TextSolutionViewModelImpl() {

    override suspend fun calculatePuzzle() {
        /** For store all available location names */
        val locationsSet = ArraySet<String>()

        /** For store distance between locations */
        val distanceMap: MutableMap<Pair<String, String>, Int> = mutableMapOf()

        splitText(input).forEach {
            val (first, second, length) = parseDistance(it)

            locationsSet.add(first)
            locationsSet.add(second)
            distanceMap[first to second] = length
        }

        Log.i("HERE", "locationsSet: ${locationsSet.joinToString()}")
        distanceMap.onEachIndexed { i, it ->
            Log.i("HERE", "$i | ${it.key} | ${it.value}")
        }

        firstValue.postValue("1")
        secondValue.postValue("2")
    }
}