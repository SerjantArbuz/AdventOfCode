package sgtmelon.adventofcode.year15.day1

import org.koin.androidx.viewmodel.ext.android.viewModel
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.databinding.ActivitySolutionBinding
import sgtmelon.adventofcode.parent.ParentActivity

/**
 * 2015 Day 1. Final time: ?
 *
 * https://adventofcode.com/2015/day/1
 */
class SantaFloorActivity : ParentActivity<ActivitySolutionBinding>() {

    override val layoutId: Int = R.layout.activity_solution

    private val viewModel: SantaFloorViewModel by viewModel<SantaFloorViewModelImpl>()

    override fun setupView() {
        super.setupView()

        supportActionBar?.title = getString(R.string.year2015day1_title)
        supportActionBar?.subtitle = getString(R.string.year2015day1_subtitle)
    }

    override fun setupObservers() {
        super.setupObservers()

        viewModel.floor.observe(this) {
            binding?.firstText?.text = it.toString()
        }
        viewModel.basementPosition.observe(this) {
            binding?.secondText?.text = it.toString()
        }
    }
}