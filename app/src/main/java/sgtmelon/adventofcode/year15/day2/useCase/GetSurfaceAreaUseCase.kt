package sgtmelon.adventofcode.year15.day2.useCase

import kotlin.math.min
import sgtmelon.adventofcode.year15.day2.model.Square

class GetSurfaceAreaUseCase {

    /**
     * First - surface, second - ribbon.
     *
     * surface = 2*l*w + 2*w*h + 2*h*l + area of the smallest side.
     * ribbon = perimeter of smallest side + l*w*h
     */
    operator fun invoke(square: Square): Pair<Long, Long> = with(square) {
        val side1 = length.value * width.value
        val side2 = width.value * height.value
        val side3 = height.value * length.value

        val surface = 2L * (side1 + side2 + side3) + min(min(side1, side2), side3)

        val perimeter1 = 2L * (length.value + width.value)
        val perimeter2 = 2L * (width.value + height.value)
        val perimeter3 = 2L * (height.value + length.value)
        val minPerimeter = min(min(perimeter1, perimeter2), perimeter3)

        val ribbon = length.value * width.value * height.value + minPerimeter

        return@with surface to ribbon
    }
}