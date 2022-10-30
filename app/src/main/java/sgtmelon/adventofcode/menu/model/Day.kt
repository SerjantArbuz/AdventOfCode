package sgtmelon.adventofcode.menu.model

data class Day(
    val i: Int,
    val solution: Solution = Solution.NONE,
    val classLink: Class<*>? = null
) {

    val isAvailable = solution != Solution.NONE
}