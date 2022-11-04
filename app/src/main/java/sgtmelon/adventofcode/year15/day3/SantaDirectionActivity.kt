package sgtmelon.adventofcode.year15.day3

import org.koin.androidx.viewmodel.ext.android.viewModel
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.staff.parent.textSolution.TextSolutionActivity

/**
 * 2015 Day 3. Final time: 45 minutes.
 *
 * https://adventofcode.com/2015/day/3
 */
class SantaDirectionActivity : TextSolutionActivity() {

    override val titleId: Int = R.string.year2015day3_title

    override val subtitleId: Int = R.string.year2015day3_subtitle

    override val viewModel by viewModel<SantaDirectionViewModel>()

}