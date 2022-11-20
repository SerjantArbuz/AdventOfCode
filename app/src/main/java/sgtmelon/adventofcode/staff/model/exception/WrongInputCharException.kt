package sgtmelon.adventofcode.staff.model.exception

class WrongInputCharException(char: Char) :
    IllegalArgumentException("Something wrong with input, illegal char: '$char'")