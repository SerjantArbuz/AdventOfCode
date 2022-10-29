package sgtmelon.adventofcode.year21.day10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import sgtmelon.adventofcode.utils.inflateBinding
import org.koin.androidx.viewmodel.ext.android.viewModel
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.databinding.ActivitySolutionBinding
import sgtmelon.adventofcode.parent.ParentActivity

/**
 * 2021 Day 10. Takes around ~2 hours for both puzzle parts.
 *
 * https://adventofcode.com/2021/day/10
 */
class SubmarineActivity : ParentActivity<ActivitySolutionBinding>() {

    override val layoutId: Int = R.layout.activity_solution

    private val viewModel: SubmarineViewModel by viewModel<SubmarineViewModelImpl>()

    override fun setupObservers() {
        super.setupObservers()

        viewModel.corruptedPoints.observe(this) {
            binding?.firstText?.text = it.toString()
        }
        viewModel.incompletePoints.observe(this) {
            binding?.secondText?.text = it.toString()
        }
    }
}