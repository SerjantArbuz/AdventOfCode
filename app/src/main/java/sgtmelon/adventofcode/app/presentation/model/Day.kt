package sgtmelon.adventofcode.app.presentation.model

data class Day(
    val id: Int,
    val solution: Solution = Solution.NONE,
    val classLink: Class<*>? = null
) {

    val isAvailable = solution != Solution.NONE && classLink != null

}