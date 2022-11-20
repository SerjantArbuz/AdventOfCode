package sgtmelon.adventofcode.staff.parent.solution

import android.view.View
import androidx.annotation.StringRes
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.databinding.ActivitySolutionBinding
import sgtmelon.adventofcode.staff.parent.ParentActivity

/**
 * Parent class for solutions with 2 text fields.
 */
abstract class SolutionActivity : ParentActivity<ActivitySolutionBinding>() {

    override val layoutId: Int = R.layout.activity_solution

    @get:StringRes abstract val titleId: Int
    @get:StringRes abstract val subtitleId: Int

    override fun setupView() {
        super.setupView()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = getString(titleId)
        supportActionBar?.subtitle = getString(subtitleId)
    }

    protected fun changeProgress(isVisible: Boolean) {
        binding?.progressBar?.visibility = if (isVisible) View.VISIBLE else View.INVISIBLE
    }

    protected fun setFirstText(it: String) = run { binding?.firstText?.text = it }

    protected fun setSecondText(it: String) = run { binding?.secondText?.text = it }
}