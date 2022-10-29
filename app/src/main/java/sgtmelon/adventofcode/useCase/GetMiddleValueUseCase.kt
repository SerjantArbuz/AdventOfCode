package sgtmelon.adventofcode.useCase

class GetMiddleValueUseCase {

    /**
     * We know what:
     * - There will always be an odd number of scores to consider.
     *
     * It means what [list] lastIndex will be always even number (lastIndex = size - 1) and
     * lastIndex will be divide without remainder by 2.
     *
     * For get middle index need use formula: lastIndex / 2 - 1.
     * Need minus 1 from divided number because indices starts from 0 and we have odd list.
     */
    operator fun invoke(list: List<Long>): Long = list.sorted()[list.indices.last / 2 - 1]
}