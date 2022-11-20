package sgtmelon.adventofcode.staff.parent.textSolution

import android.view.View
import androidx.annotation.StringRes
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.databinding.ActivitySolutionBinding
import sgtmelon.adventofcode.staff.parent.ParentActivity

/**
 * Parent class for solutions with 2 text fields.
 */
abstract class TextSolutionActivity : ParentActivity<ActivitySolutionBinding>() {

    override val layoutId: Int = R.layout.activity_solution

    @get:StringRes abstract val titleId: Int
    @get:StringRes abstract val subtitleId: Int

    abstract val viewModel: TextSolutionViewModel

    override fun setupView() {
        super.setupView()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = getString(titleId)
        supportActionBar?.subtitle = getString(subtitleId)
    }

    override fun setupObservers() {
        super.setupObservers()

        viewModel.loading.observe(this) { changeProgress(it) }
        viewModel.firstValue.observe(this) { setFirstText(it.toString()) }
        viewModel.secondValue.observe(this) { setSecondText(it.toString()) }
    }

    private fun changeProgress(isVisible: Boolean) {
        binding?.progressBar?.visibility = if (isVisible) View.VISIBLE else View.INVISIBLE
    }

    private fun setFirstText(it: String) = run { binding?.firstText?.text = it }

    private fun setSecondText(it: String) = run { binding?.secondText?.text = it }

}