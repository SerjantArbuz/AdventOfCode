package sgtmelon.adventofcode.app.parent.solution

/**
 * Parent class for solutions with 2 text fields and implemented [viewModel].
 */
abstract class TextSolutionActivity : SolutionActivity() {

    abstract val viewModel: TextSolutionViewModel

    override fun setupObservers() {
        super.setupObservers()

        viewModel.spendTime.observe(this) { setTime(it) }
        viewModel.loading.observe(this) { changeProgress(it) }
        viewModel.firstValue.observe(this) { setFirstText(it.toString()) }
        viewModel.secondValue.observe(this) { setSecondText(it.toString()) }
    }
}