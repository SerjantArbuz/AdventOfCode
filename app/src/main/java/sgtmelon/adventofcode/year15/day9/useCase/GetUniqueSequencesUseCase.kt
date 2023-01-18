package sgtmelon.adventofcode.year15.day9.useCase

import sgtmelon.adventofcode.year15.day9.model.LocationSequence

class GetUniqueSequencesUseCase {

    operator fun invoke(
        locationsArray: Array<String>,
        distanceMap: Map<Pair<String, String>, Int>
    ): Set<LocationSequence> {
        val resultSet = mutableSetOf<LocationSequence>()

        return resultSet
    }
}