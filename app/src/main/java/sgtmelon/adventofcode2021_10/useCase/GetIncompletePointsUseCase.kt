package sgtmelon.adventofcode2021_10.useCase

import sgtmelon.adventofcode2021_10.model.LineType

class GetIncompletePointsUseCase {

    operator fun invoke(line: LineType.Incomplete): Long {
        var result = 0L

        for (bracket in line.list) {
            result = result * 5 + bracket.closePair.incompletePoints
        }

        return result
    }
}