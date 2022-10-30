package sgtmelon.adventofcode.staff.parent

import androidx.annotation.StringRes
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.databinding.ActivitySolutionBinding

/**
 * Parent class for solutions with 2 text fields.
 */
abstract class ParentTextSolutionActivity : ParentActivity<ActivitySolutionBinding>() {

    override val layoutId: Int = R.layout.activity_solution

    @get:StringRes abstract val titleId: Int
    @get:StringRes abstract val subtitleId: Int

    override fun setupView() {
        super.setupView()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = getString(titleId)
        supportActionBar?.subtitle = getString(subtitleId)
    }

    fun setFirstText(it: String) = run { binding?.firstText?.text = it }

    fun setSecondText(it: String) = run { binding?.secondText?.text = it }

}