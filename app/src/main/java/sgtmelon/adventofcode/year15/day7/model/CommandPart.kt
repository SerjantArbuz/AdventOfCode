package sgtmelon.adventofcode.year15.day7.model

annotation class CommandPart {
    companion object {
        const val EMPTY = ""
        const val ARROW = " -> "
        const val AND = " AND "
        const val OR = " OR "
        const val LSHIFT = " LSHIFT "
        const val RSHIFT = " RSHIFT "
        const val NOT = "NOT "
    }
}