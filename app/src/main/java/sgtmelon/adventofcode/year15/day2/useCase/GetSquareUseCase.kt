package sgtmelon.adventofcode.year15.day2.useCase

import sgtmelon.adventofcode.year15.day2.model.Square

class GetSquareUseCase {

    operator fun invoke(measure: String) : Square {
        val sizes = measure.split("x")

        if (sizes.size != 3) throw IllegalStateException("Wrong square measure: $measure")

        return Square(sizes[0], sizes[1], sizes[2])
    }
}