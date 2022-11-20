package sgtmelon.adventofcode.year15.day6

import org.koin.androidx.viewmodel.ext.android.viewModel
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.staff.parent.textSolution.TextSolutionActivity

/**
 * 2015 Day 6. Final time: 51 minutes.
 *
 * https://adventofcode.com/2015/day/6
 */
class FireHazardActivity : TextSolutionActivity() {

    override val titleId: Int = R.string.year2015day6_title

    override val subtitleId: Int = R.string.year2015day6_subtitle

    override val viewModel by viewModel<FireHazardViewModel>()

}