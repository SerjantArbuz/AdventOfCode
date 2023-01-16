package sgtmelon.adventofcode.year15.day8.useCase

import android.util.Log

class GetStringLengthUseCase {

    private val hexSymbolRegex = Regex(pattern = "[x]\\d{2}")

    operator fun invoke(string: String): Pair<Int, Int> {
        val length = string.length

        val escaped = string.removePrefix(QUOTE)
            .removeSuffix(QUOTE)
            .replace(SINGLE_SLASH.plus(QUOTE), QUOTE)
            .replace(DOUBLE_SLASH, SINGLE_SLASH)
            .replace(hexSymbolRegex, "")

        if (string.contains(hexSymbolRegex)) {
            Log.i("HERE", "simple: $string | format: $escaped")
        }

        return length to escaped.length
    }

    companion object {
        const val QUOTE = "\""
        const val DOUBLE_SLASH = "\\\\"
        const val SINGLE_SLASH = "\\"
    }
}