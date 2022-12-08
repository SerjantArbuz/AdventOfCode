package sgtmelon.adventofcode.year21.day1

import org.koin.androidx.viewmodel.ext.android.viewModel
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.staff.parent.solution.TextSolutionActivity

/**
 * 2021 Day 1. Final time: 4m + 7m = 11m.
 *
 * https://adventofcode.com/2021/day/1
 */
class Year21Day1Activity : TextSolutionActivity() {

    override val titleId: Int = R.string.year2021day1_title

    override val subtitleId: Int = R.string.year2021day1_subtitle

    override val viewModel by viewModel<Year21Day1ViewModel>()

}