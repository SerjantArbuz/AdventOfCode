package sgtmelon.adventofcode.year15.day4

import org.koin.androidx.viewmodel.ext.android.viewModel
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.staff.parent.ParentTextSolutionActivity

/**
 * 2015 Day 4. Final time: ?.
 *
 * https://adventofcode.com/2015/day/4
 */
class MiningActivity : ParentTextSolutionActivity() {

    override val titleId: Int = R.string.year2015day4_title
    override val subtitleId: Int = R.string.year2015day4_subtitle

    private val viewModel by viewModel<MiningViewModel>()

    override fun setupObservers() {
        super.setupObservers()

        viewModel.firstValue.observe(this) { setFirstText(it.toString()) }
        viewModel.secondValue.observe(this) { setSecondText(it.toString()) }
    }
}