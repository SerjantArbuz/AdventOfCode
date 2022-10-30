package sgtmelon.adventofcode.menu

import android.content.Intent
import android.os.Bundle
import org.koin.androidx.viewmodel.ext.android.viewModel
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.menu.adapter.YearAdapter
import sgtmelon.adventofcode.menu.model.Year
import sgtmelon.adventofcode.parent.ParentMenuActivity
import sgtmelon.adventofcode.year21.day10.SubmarineActivity

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

    override fun onYearClick(year: Year) = startActivity(SolutionMenuActivity[this, year])

}