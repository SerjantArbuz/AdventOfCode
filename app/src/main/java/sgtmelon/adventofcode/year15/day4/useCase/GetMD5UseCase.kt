package sgtmelon.adventofcode.year15.day4.useCase

import java.security.MessageDigest

class GetMD5UseCase {

    operator fun invoke(text: String): ByteArray {
        return MessageDigest.getInstance("MD5")
            .digest(text.toByteArray(Charsets.UTF_8))
    }
}