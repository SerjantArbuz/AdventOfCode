package sgtmelon.adventofcode2021_10.useCase

import android.util.Log
import sgtmelon.adventofcode2021_10.model.Bracket

class GetIllegalCharUseCase {

    operator fun invoke(line: String): Bracket? {
        val openBracketList = mutableListOf<Bracket.Open>()

        for (char in line.toCharArray()) {
            when (val bracket = Bracket[char] ?: return null) {
                is Bracket.Open -> openBracketList.add(bracket)
                is Bracket.Close -> {
                    val lastOpen = openBracketList.lastOrNull() ?: return bracket

                    if (lastOpen.closePair == bracket) {
                        openBracketList.removeLast()
                    } else {
                        return bracket
                    }
                }
            }
        }

        return null
    }
}