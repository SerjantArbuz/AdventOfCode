package sgtmelon.adventofcode.year15.day9.useCase

class ParseDistanceUseCase {

    operator fun invoke(string: String): Triple<String, String, Int> {
        val firstSplit = string.split(TO)
        val secondSplit = firstSplit.last().split(EQUALS)
        return Triple(firstSplit.first(), secondSplit.first(), secondSplit.last().toInt())
    }

    private companion object {
        const val TO = " to "
        const val EQUALS = " = "
    }
}