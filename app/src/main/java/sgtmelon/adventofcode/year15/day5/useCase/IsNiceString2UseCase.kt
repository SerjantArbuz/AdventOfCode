package sgtmelon.adventofcode.year15.day5.useCase

import android.util.Log

class IsNiceString2UseCase {

    operator fun invoke(string: String): Boolean {
        var isRepeats = false
        val repeatMap = hashMapOf<String, Int>()

        var isSkipped = false
        for ((i, char) in string.toCharArray().withIndex()) {
            if (!isRepeats) {
                val nextChar = string.getOrNull(index = i + 2)
                if (nextChar != null && char == nextChar) {
                    Log.i("HERE", "isRepeats: $char${string[i + 1]}$nextChar")
                    isRepeats = true
                }
            }

            val nextChar = string.getOrNull(index = i + 1) ?: break
            val previousChar = string.getOrNull(index = i - 1)
            val previousPair = "$previousChar$char"
            val pair = "$char$nextChar"

            /** Skip overlaps */
            if (previousChar != null && previousPair == pair) {
                if (isSkipped) {
                    isSkipped = false
                } else {
                    isSkipped = true
                    Log.i("HERE", "overlap: previous=$previousPair, next=$pair")
                    continue
                }
            }

            val count = repeatMap[pair] ?: 0
            repeatMap[pair] = count + 1
        }

        for ((i, value) in repeatMap.values.withIndex()) {
            if (value >= 2) {
                Log.i("HERE", "havePair: ${repeatMap.keys.toList()[i]}")
                break
            }
        }

        val isNice = isRepeats && repeatMap.values.any { it >= 2 }
        if (isNice) {
            Log.i("HERE", "isNice!")
        } else {
            Log.i("HERE", "naughty :(")
        }

        return isNice
    }
}