package sgtmelon.adventofcode.year15.day1.useCase

import sgtmelon.adventofcode.year15.day1.model.Bracket

class GetFloorUseCase {

    operator fun invoke(text: String): Int {
        var result = 0

        for (char in text.toCharArray()) {
            when (char) {
                Bracket.Open.symbol -> result += 1
                Bracket.Close.symbol -> result -= 1
            }
        }

        return result
    }
}