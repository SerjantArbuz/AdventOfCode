package sgtmelon.adventofcode.year15.day6

import org.koin.androidx.viewmodel.ext.android.viewModel
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.app.presentation.screen.parent.solution.TextSolutionActivity

/**
 * 2015 Day 6. Final time: 51 minutes.
 *
 * https://adventofcode.com/2015/day/6
 */
class Year15Day6Activity : TextSolutionActivity() {

    override val titleId: Int = R.string.year2015day6_title

    override val subtitleId: Int = R.string.year2015day6_subtitle

    override val viewModel by viewModel<Year15Day6ViewModel>()

}