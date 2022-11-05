package sgtmelon.adventofcode.year15.day5.useCase

class IsNiceStringUseCase {

    private val vowelsList = listOf('a', 'e', 'i', 'o', 'u')
    private val banText = listOf("ab", "cd", "pq", "xy")

    operator fun invoke(string: String): Boolean {
        var vowelsCount = 0
        var haveTwice = false

        for ((i, char) in string.toCharArray().withIndex()) {
            if (i != string.lastIndex) {
                val nextIndex = i + 1
                if (banText.contains("$char${string[nextIndex]}")) {
                    return false
                }

                if (!haveTwice && char == string[nextIndex]) {
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