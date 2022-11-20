package sgtmelon.adventofcode.year15.day3.useCase

import sgtmelon.adventofcode.year15.day3.model.Direction

class GetWithRobotHousesUseCase {

    operator fun invoke(input: String): HashMap<String, Int> {
        var x1 = 0; var y1 = 0
        var x2 = 0; var y2 = 0

        fun getKey(isSanta: Boolean): String = if (isSanta) "$x1/$y1" else "$x2/$y2"

        val coordinatesMap = hashMapOf(getKey(isSanta = true) to 2)

        for ((i, char) in input.toCharArray().withIndex()) {
            val isSanta = i % 2 == 1

            when (Direction[char]) {
                Direction.North -> if (isSanta) y1 += 1 else y2 += 1
                Direction.South -> if (isSanta) y1 -= 1 else y2 -= 1
                Direction.East -> if (isSanta) x1 += 1 else x2 += 1
                Direction.West -> if (isSanta) x1 -= 1 else x2 -= 1
            }

            val presentCount: Int = coordinatesMap[getKey(isSanta)] ?: 0
            coordinatesMap[getKey(isSanta)] = presentCount + 1
        }

        return coordinatesMap
    }
}