package sgtmelon.adventofcode.year15.day1

import org.koin.androidx.viewmodel.ext.android.viewModel
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.staff.parent.textSolution.TextSolutionActivity

/**
 * 2015 Day 1. Final time: 13 minutes.
 *
 * https://adventofcode.com/2015/day/1
 */
class SantaFloorActivity : TextSolutionActivity() {

    override val titleId: Int = R.string.year2015day1_title

    override val subtitleId: Int = R.string.year2015day1_subtitle

    override val viewModel by viewModel<SantaFloorViewModel>()

}