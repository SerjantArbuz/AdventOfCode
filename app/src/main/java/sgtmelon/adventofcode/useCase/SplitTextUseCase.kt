package sgtmelon.adventofcode.useCase

class SplitTextUseCase {

    operator fun invoke(text: String): List<String> = text.split("\n")
}