package sgtmelon.adventofcode.app.domain

class SplitTextUseCase {

    operator fun invoke(text: String, delimiter: String = "\n"): List<String> {
        return text.split(delimiter)
    }
}