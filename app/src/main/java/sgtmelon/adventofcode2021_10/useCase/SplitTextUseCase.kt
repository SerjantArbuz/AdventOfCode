package sgtmelon.adventofcode2021_10.useCase

class SplitTextUseCase {

    operator fun invoke(text: String): List<String> = text.split("\n")
}