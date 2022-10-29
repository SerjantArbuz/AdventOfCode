package sgtmelon.adventofcode.year21.day10.useCase

class SplitTextUseCase {

    operator fun invoke(text: String): List<String> = text.split("\n")
}