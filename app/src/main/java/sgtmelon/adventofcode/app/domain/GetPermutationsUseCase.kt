package sgtmelon.adventofcode.app.domain

class GetPermutationsUseCase<T> {

    operator fun invoke(set: Set<T>): Set<List<T>> {
        return if (set.isEmpty()) emptySet() else getPermutations(set.toList())
    }

    private fun <T> getPermutations(list: List<T>): Set<List<T>> {
        if (list.isEmpty()) return setOf(emptyList())

        val result: MutableSet<List<T>> = mutableSetOf()
        for (i in list.indices) {
            getPermutations(list = list - list[i]).forEach { item ->
                result.add(item + list[i])
            }
        }

        return result
    }
}