package sgtmelon.adventofcode.app.common

class SplitTextUseCase {

    operator fun invoke(text: String, delimiter: String = "\n"): List<String> {
        return text.split(delimiter)
    }
}