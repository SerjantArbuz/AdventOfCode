package sgtmelon.adventofcode.year15.day2

import org.koin.androidx.viewmodel.ext.android.viewModel
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.staff.parent.solution.TextSolutionActivity

/**
 * 2015 Day 2. Final time: 40 minutes
 *
 * https://adventofcode.com/2015/day/2
 */
class Year15Day2Activity : TextSolutionActivity() {

    override val titleId: Int = R.string.year2015day2_title

    override val subtitleId: Int = R.string.year2015day2_subtitle

    override val viewModel by viewModel<Year15Day2ViewModel>()

}