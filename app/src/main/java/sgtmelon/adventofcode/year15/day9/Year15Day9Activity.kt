package sgtmelon.adventofcode.year15.day9

import org.koin.androidx.viewmodel.ext.android.viewModel
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.app.presentation.screen.parent.solution.TextSolutionActivity

/**
 * 2015 Day 9. Final time: ~2h.
 *
 * https://adventofcode.com/2015/day/9
 */
class Year15Day9Activity : TextSolutionActivity() {

    override val titleId: Int = R.string.year2015day9_title

    override val subtitleId: Int = R.string.year2015day9_subtitle

    override val viewModel by viewModel<Year15Day9ViewModel>()

}