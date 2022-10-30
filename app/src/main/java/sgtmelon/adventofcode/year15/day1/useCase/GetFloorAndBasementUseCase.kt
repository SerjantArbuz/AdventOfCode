package sgtmelon.adventofcode.year15.day1.useCase

class GetFloorAndBasementUseCase {

    /**
     * First - needed floor
     * Second - basement position
     */
    operator fun invoke(text: String): Pair<Int, Int> {
        var floor = 0
        var basementPosition = 0

        for ((i, char) in text.toCharArray().withIndex()) {
            when (char) {
                '(' -> floor += 1
                ')' -> floor -= 1
            }

            if (basementPosition == 0 && floor == -1) {
                /** +1 because indexing starts from 0 */
                basementPosition = i + 1
            }
        }

        return floor to basementPosition
    }
}