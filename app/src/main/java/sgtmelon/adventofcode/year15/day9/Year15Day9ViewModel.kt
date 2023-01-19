package sgtmelon.adventofcode.year15.day9

import sgtmelon.adventofcode.app.domain.GetPermutationsUseCase
import sgtmelon.adventofcode.app.domain.SplitTextUseCase
import sgtmelon.adventofcode.app.presentation.screen.parent.solution.TextSolutionViewModelImpl
import sgtmelon.adventofcode.year15.day9.useCase.GetMinMaxLengthUseCase
import sgtmelon.adventofcode.year15.day9.useCase.ParseDistanceUseCase

class Year15Day9ViewModel(
    private val input: String,
    private val splitText: SplitTextUseCase,
    private val parseDistance: ParseDistanceUseCase,
    private val getPermutations: GetPermutationsUseCase<String>,
    private val getMinMaxLength: GetMinMaxLengthUseCase
) : TextSolutionViewModelImpl() {

    override suspend fun calculatePuzzle() {
        val (locationsSet, distanceMap) = getEntryData()
        val (min, max) = getMinMaxLength(distanceMap, getPermutations(locationsSet))

        firstValue.postValue(min.toString())
        secondValue.postValue(max.toString())
    }

    private fun getEntryData(): Pair<Set<String>, Map<Pair<String, String>, Int>> {
        /** For store all available location names. */
        val locationsSet = mutableSetOf<String>()

        /** For store distance between two locations. */
        val distanceMap: MutableMap<Pair<String, String>, Int> = mutableMapOf()

        splitText(input).forEach {
            val (first, second, length) = parseDistance(it)

            locationsSet.add(first)
            locationsSet.add(second)

            /** Write in both ways, because it's faster in the result (when will get length). */
            distanceMap[first to second] = length
            distanceMap[second to first] = length
        }

        return locationsSet to distanceMap
    }
}