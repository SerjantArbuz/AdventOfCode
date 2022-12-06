package sgtmelon.adventofcode.year21.day1.useCase

class CalculateChangesUseCase {

    operator fun invoke(lineList: List<String>): Int {
        var previousValue: Int? = null
        var increaseCount = 0

        for (line in lineList) {
            val value = line.toInt()
            previousValue?.let { if (value > it) increaseCount++ }
            previousValue = value
        }

        return increaseCount
    }
}