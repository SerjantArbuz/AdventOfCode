package sgtmelon.adventofcode.year15.day1

import org.koin.androidx.viewmodel.ext.android.viewModel
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.staff.parent.ParentTextSolutionActivity

/**
 * 2015 Day 1. Final time: 13 minutes.
 *
 * https://adventofcode.com/2015/day/1
 */
class SantaFloorActivity : ParentTextSolutionActivity() {

    override val titleId: Int = R.string.year2015day1_title
    override val subtitleId: Int = R.string.year2015day1_subtitle

    private val viewModel: SantaFloorViewModel by viewModel<SantaFloorViewModelImpl>()

    override fun setupObservers() {
        super.setupObservers()

        viewModel.floor.observe(this) { setFirstText(it.toString()) }
        viewModel.basementPosition.observe(this) { setSecondText(it.toString()) }
    }
}