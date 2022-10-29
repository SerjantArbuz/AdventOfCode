package sgtmelon.adventofcode.year21.day10.useCase

import sgtmelon.adventofcode.year21.day10.model.LineType

class GetIncompletePointsUseCase {

    operator fun invoke(line: LineType.Incomplete): Long {
        var result = 0L

        /**
         * Reversed because we need start to take bracket points from the end of incomplete
         * sequence.
         */
        for (bracket in line.list.asReversed()) {
            result = result * 5 + bracket.closePair.incompletePoints
        }

        return result
    }
}