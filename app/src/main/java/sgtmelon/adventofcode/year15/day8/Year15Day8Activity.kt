package sgtmelon.adventofcode.year15.day8

import org.koin.androidx.viewmodel.ext.android.viewModel
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.app.presentation.screen.parent.solution.TextSolutionActivity

/**
 * 2015 Day 8. Final time: ?.
 *
 * https://adventofcode.com/2015/day/8
 */
class Year15Day8Activity : TextSolutionActivity() {

    override val titleId: Int = R.string.year2015day8_title

    override val subtitleId: Int = R.string.year2015day8_subtitle

    override val viewModel by viewModel<Year15Day8ViewModel>()

}