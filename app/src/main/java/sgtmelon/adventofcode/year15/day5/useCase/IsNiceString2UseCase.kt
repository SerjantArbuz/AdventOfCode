package sgtmelon.adventofcode.year15.day5.useCase

class IsNiceString2UseCase {

    operator fun invoke(string: String): Boolean {
        /** Pair: first - position, second - count */
        val repeatMap = hashMapOf<String, Pair<Int, Int>>()
        var isRepeats = false

        for ((i, char) in string.toCharArray().withIndex()) {
            if (!isRepeats) {
                isRepeats = char == string.getOrNull(index = i + 2)
            }

            val nextChar = string.getOrNull(index = i + 1) ?: break
            val charPair = "$char$nextChar"
            val repeatPair = repeatMap[charPair]

            /**
             * Skipping overlaps and continue working with cases like this one: 'rxexcbwhiywwwwnu'
             *
             * Check by position explanation:
             * - If difference between positions == 1 -> overlap ("www")
             * - Else -> it's pair ("ww" and "ww")
             */
            if (repeatPair != null && i - repeatPair.first == 1) continue

            val newCount = (repeatPair?.second ?: 0) + 1
            repeatMap[charPair] = i to newCount
        }

        return isRepeats && repeatMap.values.any { it.second >= 2 }
    }
}