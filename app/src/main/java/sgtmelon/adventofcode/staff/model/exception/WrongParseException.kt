package sgtmelon.adventofcode.staff.model.exception

class WrongParseException(
    it: Throwable
) : Throwable(message = "Something wrong with data parser", it)