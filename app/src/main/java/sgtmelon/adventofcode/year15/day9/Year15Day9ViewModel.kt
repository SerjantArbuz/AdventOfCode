package sgtmelon.adventofcode.year15.day9

import android.util.Log
import sgtmelon.adventofcode.app.domain.SplitTextUseCase
import sgtmelon.adventofcode.app.presentation.screen.parent.solution.TextSolutionViewModelImpl
import sgtmelon.adventofcode.year15.day9.useCase.GetLengthUseCase
import sgtmelon.adventofcode.year15.day9.useCase.GetUniqueSequencesUseCase
import sgtmelon.adventofcode.year15.day9.useCase.ParseDistanceUseCase

class Year15Day9ViewModel(
    private val input: String,
    private val splitText: SplitTextUseCase,
    private val parseDistance: ParseDistanceUseCase,
    private val getUniqueSequences: GetUniqueSequencesUseCase,
    private val getLength: GetLengthUseCase
) : TextSolutionViewModelImpl() {

    // TODO optimize data types (lists, sets, maps, arrays)

    override suspend fun calculatePuzzle() {
        /** For store all available location names */
        val locationsSet = mutableSetOf<String>()

        /** For store distance between locations */
        val distanceMap: MutableMap<Pair<String, String>, Int> = mutableMapOf()

        splitText(input).forEach {
            val (first, second, length) = parseDistance(it)

            locationsSet.add(first)
            locationsSet.add(second)
            distanceMap[first to second] = length
        }

        distanceMap.forEach {
            Log.i("HERE", "distanceMap: ${it.key} | ${it.value}")
        }

        val uniqueSequences = getUniqueSequences(locationsSet)
        val lengthMap = uniqueSequences.map { getLength(distanceMap, it) }

        lengthMap.forEach {
            Log.i("HERE", "length: $it")
        }

        firstValue.postValue(lengthMap.min().toString())
        secondValue.postValue("2")
    }
}