package sgtmelon.adventofcode2021_10.useCase

class IsLineFullUseCase {

    operator fun invoke(line: String): Boolean = line.length % 2 == 0
}