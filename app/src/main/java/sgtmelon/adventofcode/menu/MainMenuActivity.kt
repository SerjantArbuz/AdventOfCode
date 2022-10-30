package sgtmelon.adventofcode.menu

import org.koin.androidx.viewmodel.ext.android.viewModel
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.menu.adapter.YearAdapter
import sgtmelon.adventofcode.menu.model.Year
import sgtmelon.adventofcode.parent.ParentMenuActivity

class MainMenuActivity : ParentMenuActivity(),
    YearAdapter.Callback {

    override val columnCountId: Int = R.integer.main_column_count

    private val viewModel: MainMenuViewModel by viewModel<MainMenuViewModelImpl>()

    override val adapter = YearAdapter(callback = this)

    override fun setupObservers() {
        super.setupObservers()
        viewModel.yearList.observe(this) { adapter.submitList(it) }
    }

    override fun onYearClick(year: Year) = startActivity(SolutionMenuActivity[this, year])

}