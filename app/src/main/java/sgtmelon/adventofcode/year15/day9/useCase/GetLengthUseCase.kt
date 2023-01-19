package sgtmelon.adventofcode.year15.day9.useCase

import android.util.Log

class GetLengthUseCase {

    operator fun invoke(distanceMap: Map<Pair<String, String>, Int>, sequence: List<String>): Int {
        var length = 0


        sequence.forEachIndexed { i, item ->
            val nextItem = sequence.getOrNull(index = i + 1) ?: run {
                Log.i("HERE", "nextItem is null: $i")
                return@forEachIndexed
            }
            length += distanceMap[item to nextItem] ?: run {
                distanceMap[nextItem to item] ?: run {
                    Log.i("HERE", "can't find pair: $item | $nextItem")
                    0
                }
            }
        }

        return length
    }
}