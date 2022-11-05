package sgtmelon.adventofcode.year15.day5.useCase

class IsNiceString1UseCase {

    private val vowelsList = listOf('a', 'e', 'i', 'o', 'u')
    private val banPairs = listOf("ab", "cd", "pq", "xy")

    operator fun invoke(string: String): Boolean {
        var vowelsCount = 0
        var haveTwice = false

        for ((i, char) in string.toCharArray().withIndex()) {
            val nextChar = string.getOrNull(index = i + 1)
            if (nextChar != null) {
                if (banPairs.contains("$char$nextChar")) {
                    return false
                }

                if (!haveTwice) {
                    haveTwice = char == nextChar
                }
            }

            if (vowelsList.contains(char)) {
                vowelsCount++
            }
        }

        return vowelsCount >= 3 && haveTwice
    }
}