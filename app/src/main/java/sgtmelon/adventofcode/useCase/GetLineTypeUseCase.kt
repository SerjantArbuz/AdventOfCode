package sgtmelon.adventofcode.useCase

import sgtmelon.adventofcode.model.Bracket
import sgtmelon.adventofcode.model.LineType

class GetLineTypeUseCase {

    operator fun invoke(line: String): LineType {
        val openBracketList = mutableListOf<Bracket.Open>()

        for (char in line.toCharArray()) {
            when (val bracket = Bracket[char]) {
                is Bracket.Open -> openBracketList.add(bracket)
                is Bracket.Close -> {
                    val lastOpen = openBracketList.lastOrNull()
                    if (lastOpen != null && lastOpen.closePair == bracket) {
                        openBracketList.removeLast()
                    } else {
                        return LineType.Corrupted(bracket)
                    }
                }
            }
        }

        return LineType.Incomplete(openBracketList)
    }
}