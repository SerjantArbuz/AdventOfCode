package sgtmelon.adventofcode.year15.day4.model

sealed class HashState(val iteration: Long, val hash: String) {

    class Iteration(iteration: Long, hash: String) : HashState(iteration, hash)

    class Result(iteration: Long, hash: String) : HashState(iteration, hash)

    override fun toString(): String = "iteration: $iteration | hash:\n$hash"

}