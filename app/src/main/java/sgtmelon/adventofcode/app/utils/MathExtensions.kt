package sgtmelon.adventofcode.app.utils

val Int.factorial: Int get() = let { if (it != 1) it * (it - 1).factorial else 1 }