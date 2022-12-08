package sgtmelon.adventofcode.year21.day1.useCase

class CalculateChangesUseCase {

    operator fun invoke(lineList: List<String>): Pair<Int, Int> {
        var singlePreviousValue: Int? = null
        var singleIncreaseSequence = 0

        var triplePreviousSum: Int? = null
        var tripleIncreaseSequence = 0

        for ((i, line) in lineList.withIndex()) {
            val value = line.toInt()

            singlePreviousValue?.let { if (value > it) singleIncreaseSequence++ }
            singlePreviousValue = value

            val firstNextValue = lineList.getOrNull(index = i + 1)?.toInt()
            val secondNextValue = lineList.getOrNull(index = i + 2)?.toInt()

            if (firstNextValue != null && secondNextValue != null) {
                val currentSum = value + firstNextValue + secondNextValue
                triplePreviousSum?.let { if (currentSum > it) tripleIncreaseSequence++ }
                triplePreviousSum = currentSum
            }
        }

        return singleIncreaseSequence to tripleIncreaseSequence
    }
}