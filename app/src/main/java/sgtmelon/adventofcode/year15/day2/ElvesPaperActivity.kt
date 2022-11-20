package sgtmelon.adventofcode.year15.day2

import org.koin.androidx.viewmodel.ext.android.viewModel
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.staff.parent.ParentTextSolutionActivity

/**
 * 2015 Day 2. Final time: 40 minutes
 *
 * https://adventofcode.com/2015/day/2
 */
class ElvesPaperActivity : ParentTextSolutionActivity() {

    override val titleId: Int = R.string.year2015day2_title
    override val subtitleId: Int = R.string.year2015day2_subtitle

    private val viewModel: ElvesPaperViewModel by viewModel<ElvesPaperViewModelImpl>()

    override fun setupObservers() {
        super.setupObservers()

        viewModel.paperNeeded.observe(this) { setFirstText(it.toString()) }
        viewModel.ribbonNeeded.observe(this) { setSecondText(it.toString()) }
    }
}