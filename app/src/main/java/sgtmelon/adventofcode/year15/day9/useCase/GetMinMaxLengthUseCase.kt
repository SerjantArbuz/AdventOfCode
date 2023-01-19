package sgtmelon.adventofcode.year15.day9.useCase

class GetMinMaxLengthUseCase {

    operator fun invoke(
        distanceMap: Map<Pair<String, String>, Int>,
        permutationsSet: Set<List<String>>
    ): Pair<Int, Int> {
        var min = 0
        var max = 0

        permutationsSet.forEach {
            val length = getSequenceLength(distanceMap, it)

            if (length > max) {
                max = length
            }

            if (min == 0 || length < min) {
                min = length
            }
        }

        return min to max
    }

    private fun getSequenceLength(
        distanceMap: Map<Pair<String, String>, Int>,
        permutation: List<String>
    ): Int {
        var length = 0

        for ((i, item) in permutation.withIndex()) {
            val nextItem = permutation.getOrNull(index = i + 1) ?: break

            length += distanceMap[item to nextItem] ?: distanceMap[nextItem to item]
                    ?: throw NullPointerException("Unknown pair: $item/$nextItem")
        }

        return length
    }
}