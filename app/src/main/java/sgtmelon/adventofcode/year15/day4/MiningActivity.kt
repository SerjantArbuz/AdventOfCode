package sgtmelon.adventofcode.year15.day4

import org.koin.androidx.viewmodel.ext.android.viewModel
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.staff.parent.solution.SolutionActivity
import sgtmelon.adventofcode.staff.utils.collect
import sgtmelon.adventofcode.year15.day4.model.HashState

/**
 * 2015 Day 4. Final time: 30 minutes.
 *
 * https://adventofcode.com/2015/day/4
 */
class MiningActivity : SolutionActivity() {

    override val titleId: Int = R.string.year2015day4_title

    override val subtitleId: Int = R.string.year2015day4_subtitle

    val viewModel: MiningViewModel by viewModel<MiningViewModelImpl>()

    override fun setupObservers() {
        super.setupObservers()

        viewModel.firstValue.collect(this) {
            when (it) {
                is HashState.Iteration -> setFirstText(it.toString())
                is HashState.Result -> collectSecond(it)
            }
        }
    }

    private fun collectSecond(firstResult: HashState.Result) {
        viewModel.getSecondValue(firstResult).collect(this) {
            when (it) {
                is HashState.Iteration -> setSecondText(it.toString())
                is HashState.Result -> changeProgress(isVisible = false)
            }
        }
    }
}