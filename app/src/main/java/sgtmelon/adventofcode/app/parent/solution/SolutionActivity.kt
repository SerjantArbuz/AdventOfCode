package sgtmelon.adventofcode.app.parent.solution

import android.view.View
import androidx.annotation.StringRes
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.app.parent.ParentActivity
import sgtmelon.adventofcode.databinding.ActivitySolutionBinding

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

    protected fun setTime(value: Long) {
        binding?.timeText?.visibility = View.VISIBLE
        binding?.timeText?.text = getString(R.string.time_result, value)
    }

    protected fun changeProgress(isVisible: Boolean) {
        binding?.progressBar?.visibility = if (isVisible) View.VISIBLE else View.INVISIBLE
    }

    protected fun setFirstText(it: String) = run { binding?.firstText?.text = it }

    protected fun setSecondText(it: String) = run { binding?.secondText?.text = it }
}