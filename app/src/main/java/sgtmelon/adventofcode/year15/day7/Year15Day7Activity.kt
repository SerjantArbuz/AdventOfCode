package sgtmelon.adventofcode.year15.day7

import org.koin.androidx.viewmodel.ext.android.viewModel
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.app.presentation.screen.parent.solution.TextSolutionActivity

/**
 * 2015 Day 7. Final time: 44m + 8m = 52m in total.
 *
 * https://adventofcode.com/2015/day/7
 */
class Year15Day7Activity : TextSolutionActivity() {

    override val titleId: Int = R.string.year2015day7_title

    override val subtitleId: Int = R.string.year2015day7_subtitle

    override val viewModel by viewModel<Year15Day7ViewModel>()

}