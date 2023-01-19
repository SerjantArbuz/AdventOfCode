package sgtmelon.adventofcode.year15.day9.useCase

class GetUniqueSequencesUseCase {

    operator fun invoke(set: Set<String>): Set<List<String>> {
        return if (set.isEmpty()) emptySet() else allPermutations(set.toList())
    }

    private fun <T> allPermutations(list: List<T>): Set<List<T>> {
        if (list.isEmpty()) return setOf(emptyList())

        val result: MutableSet<List<T>> = mutableSetOf()
        for (i in list.indices) {
            allPermutations(list = list - list[i]).forEach { item ->
                result.add(item + list[i])
            }
        }
        return result
    }

}