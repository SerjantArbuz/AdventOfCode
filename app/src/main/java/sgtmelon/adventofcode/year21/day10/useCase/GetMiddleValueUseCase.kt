package sgtmelon.adventofcode.year21.day10.useCase

class GetMiddleValueUseCase {

    /**
     * We know what:
     * - There will always be an odd number of scores to consider.
     *
     * It means what [list] lastIndex will be always even number (lastIndex = size - 1) and
     * lastIndex will be divide without remainder by 2.
     *
     * For get middle index need use formula: lastIndex / 2.
     * Don't forget indices starts from zero.
     *
     * Example:
     * size=51, lastIndex=50, middleIndex=50/2=25 (24 indices before and after this value).
     */
    operator fun invoke(list: List<Long>): Long = list.sorted()[list.lastIndex / 2]
}