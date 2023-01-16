package sgtmelon.adventofcode.app.blank

import org.koin.androidx.viewmodel.ext.android.viewModel
import sgtmelon.adventofcode.app.presentation.screen.parent.solution.TextSolutionActivity

/**
 * YEAR? Day NUMBER?. Final time: ?.
 *
 * URL_LINK?
 */
class BlankActivity : TextSolutionActivity() {

    override val titleId: Int = TODO(reason = "R.string.?")

    override val subtitleId: Int = TODO(reason = "R.string.?")

    override val viewModel by viewModel<BlankViewModel>()

}