package sgtmelon.adventofcode.year15.day3.useCase

import sgtmelon.adventofcode.year15.day3.model.Direction

class GetUniqueHousesUseCase {

    operator fun invoke(input: String): HashMap<String, Int> {
        var x = 0; var y = 0

        fun getKey(): String = "$x/$y"

        val coordinatesMap = hashMapOf(getKey() to 1)

        for (char in input.toCharArray()) {
            when (Direction[char]) {
                Direction.North -> y += 1
                Direction.South -> y -= 1
                Direction.East -> x += 1
                Direction.West -> x -= 1
            }

            val presentCount: Int = coordinatesMap[getKey()] ?: 0
            coordinatesMap[getKey()] = presentCount + 1
        }

        return coordinatesMap
    }
}