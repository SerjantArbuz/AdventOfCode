package sgtmelon.adventofcode.year15.day5.useCase

class IsNiceString2UseCase {

    private val pairRepeatsRegex = Regex(pattern = ".*(..).*\\1.*")
    private val letterRepeatsRegex = Regex(pattern = ".*(.).\\1.*")

    operator fun invoke(string: String): Boolean = string.matches(pairRepeatsRegex)
            && string.matches(letterRepeatsRegex)

}