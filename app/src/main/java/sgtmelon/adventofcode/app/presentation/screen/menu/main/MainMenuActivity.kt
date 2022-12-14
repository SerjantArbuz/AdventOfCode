package sgtmelon.adventofcode.app.presentation.screen.menu.main

import android.content.Intent
import android.os.Bundle
import org.koin.androidx.viewmodel.ext.android.viewModel
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.app.presentation.adapter.YearAdapter
import sgtmelon.adventofcode.app.presentation.model.Year
import sgtmelon.adventofcode.app.presentation.screen.menu.solution.SolutionsMenuActivity
import sgtmelon.adventofcode.app.presentation.screen.parent.ParentMenuActivity

class MainMenuActivity : ParentMenuActivity(),
    YearAdapter.Callback {

    override val columnCountId: Int = R.integer.main_column_count

    private val viewModel: MainMenuViewModel by viewModel<MainMenuViewModelImpl>()

    override val adapter = YearAdapter(callback = this)

    /** Change this variable for open specific screen (class) directly (skipping the menu). */
    private val fastAccessClass: Class<*>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (fastAccessClass != null) {
            startActivity(Intent(this, fastAccessClass))
        }
    }

    override fun setupObservers() {
        super.setupObservers()
        viewModel.yearList.observe(this) { adapter.submitList(it) }
    }

    override fun onYearClick(year: Year) = startActivity(SolutionsMenuActivity[this, year])

}