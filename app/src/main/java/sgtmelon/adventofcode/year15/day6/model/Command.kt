package sgtmelon.adventofcode.year15.day6.model

enum class Command(val value: String, val bright: Int) {
    ON(value = "turn on", bright = 1),
    OFF(value = "turn off", bright = -1),
    TOGGLE(value = "toggle", bright = 2)
}