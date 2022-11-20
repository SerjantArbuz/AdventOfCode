package sgtmelon.adventofcode.year15.day5.useCase

class IsNiceString1UseCase {

    private val vowelsRegex = Regex(pattern = ".*([aeiou].*){3}.*")
    private val twiceLetterRegex = Regex(pattern = ".*(.)\\1.*")
    private val banSequenceRegex = Regex(pattern = ".*((ab)|(cd)|(pq)|(xy)).*")

    operator fun invoke(string: String): Boolean = string.matches(vowelsRegex)
            && string.matches(twiceLetterRegex)
            && !string.matches(banSequenceRegex)

}