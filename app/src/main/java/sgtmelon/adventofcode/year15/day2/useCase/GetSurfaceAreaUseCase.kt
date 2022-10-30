package sgtmelon.adventofcode.year15.day2.useCase

import kotlin.math.min
import sgtmelon.adventofcode.year15.day2.model.Square

class GetSurfaceAreaUseCase {

    /**
     * 2*l*w + 2*w*h + 2*h*l + area of the smallest side
     */
    operator fun invoke(square: Square): Long = with(square) {
        val side1 = length.value * width.value
        val side2 = width.value * height.value
        val side3 = height.value * length.value

        return@with 2L * (side1 + side2 + side3) + min(min(side1, side2), side3)
    }
}