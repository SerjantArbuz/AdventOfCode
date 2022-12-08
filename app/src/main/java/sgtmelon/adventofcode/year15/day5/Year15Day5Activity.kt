package sgtmelon.adventofcode.year15.day5

import org.koin.androidx.viewmodel.ext.android.viewModel
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.staff.parent.solution.TextSolutionActivity

/**
 * 2015 Day 5. Final time: 1h 15m minutes.
 *
 * https://adventofcode.com/2015/day/5
 */
class Year15Day5Activity : TextSolutionActivity() {

    override val titleId: Int = R.string.year2015day5_title

    override val subtitleId: Int = R.string.year2015day5_subtitle

    override val viewModel by viewModel<Year15Day5ViewModel>()

}