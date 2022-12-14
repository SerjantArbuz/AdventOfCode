package sgtmelon.adventofcode.year15.day2.useCase

import sgtmelon.adventofcode.year15.day2.model.Square

class GetSurfaceAreaUseCase {

    /**
     * Return: first - surface, second - ribbon.
     *
     * surface = 2*l*w + 2*w*h + 2*h*l + area of the smallest side.
     * ribbon = l*w*h + perimeter of smallest side
     */
    operator fun invoke(shape: Square): Pair<Long, Long> = with(shape) {
        val (side1, side2) = smallestSide

        val surface = square + side1 * side2
        val ribbon = volume + 2L * (side1 + side2)

        return@with surface to ribbon
    }
}