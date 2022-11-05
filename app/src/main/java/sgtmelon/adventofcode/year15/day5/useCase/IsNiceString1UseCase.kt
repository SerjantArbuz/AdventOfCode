package sgtmelon.adventofcode.year15.day5.useCase

class IsNiceString1UseCase {

    private val vowelsList = listOf('a', 'e', 'i', 'o', 'u')
    private val banText = listOf("ab", "cd", "pq", "xy")

    operator fun invoke(string: String): Boolean {
        var vowelsCount = 0
        var haveTwice = false

        for ((i, char) in string.toCharArray().withIndex()) {
            val nextChar = string.getOrNull(i + 1)
            if (nextChar != null) {
                if (banText.contains("$char$nextChar")) {
                    return false
                }

                if (!haveTwice && char == nextChar) {
                    haveTwice = true
                }
            }

            if (vowelsList.contains(char)) {
                vowelsCount++
            }
        }

        return vowelsCount >= 3 && haveTwice
    }
}