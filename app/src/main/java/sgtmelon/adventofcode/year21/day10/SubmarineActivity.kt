package sgtmelon.adventofcode.year21.day10

import org.koin.androidx.viewmodel.ext.android.viewModel
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.staff.parent.textSolution.TextSolutionActivity

/**
 * 2021 Day 10. Takes around ~2 hours for both puzzle parts.
 *
 * https://adventofcode.com/2021/day/10
 */
class SubmarineActivity : TextSolutionActivity() {

    override val titleId: Int = R.string.year2021day10_title

    override val subtitleId: Int = R.string.year2021day10_subtitle

    override val viewModel by viewModel<SubmarineViewModelImpl>()

}