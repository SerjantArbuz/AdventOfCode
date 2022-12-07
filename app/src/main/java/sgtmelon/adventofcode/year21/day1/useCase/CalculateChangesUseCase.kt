package sgtmelon.adventofcode.year21.day1.useCase

class CalculateChangesUseCase {

    operator fun invoke(lineList: List<String>): Pair<Int, Int> {
        var singlePreviousValue: Int? = null
        var singleIncreaseCount = 0

        var threePreviousSum: Int? = null
        var threeIncreaseCount = 0

        for ((i, line) in lineList.withIndex()) {
            val value = line.toInt()

            singlePreviousValue?.let { if (value > it) singleIncreaseCount++ }
            singlePreviousValue = value

            if (i + 2 in lineList.indices) {
                val currentSum = value + lineList[i + 1].toInt() + lineList[i + 2].toInt()
                threePreviousSum?.let { if (currentSum > it) threeIncreaseCount++ }
                threePreviousSum = currentSum
            }
        }

        return singleIncreaseCount to threeIncreaseCount
    }
}