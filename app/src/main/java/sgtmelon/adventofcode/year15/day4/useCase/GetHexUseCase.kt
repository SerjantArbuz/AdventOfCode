package sgtmelon.adventofcode.year15.day4.useCase

class GetHexUseCase {

    operator fun invoke(array: ByteArray): String {
        return array.joinToString(separator = "") { "%02x".format(it) }
    }
}