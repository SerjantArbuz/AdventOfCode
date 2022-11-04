package sgtmelon.adventofcode.year15.day4

import org.koin.androidx.viewmodel.ext.android.viewModel
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.staff.parent.textSolution.TextSolutionActivity

/**
 * 2015 Day 4. Final time: 30 minutes.
 *
 * https://adventofcode.com/2015/day/4
 */
class MiningActivity : TextSolutionActivity() {

    override val titleId: Int = R.string.year2015day4_title

    override val subtitleId: Int = R.string.year2015day4_subtitle

    override val viewModel by viewModel<MiningViewModel>()

}