package sgtmelon.adventofcode.staff.model.exception

class WrongInputCharException(
    text: String
) : IllegalArgumentException("Something wrong with input, illegal: $text") {

    constructor(char: Char) : this(char.toString())

}