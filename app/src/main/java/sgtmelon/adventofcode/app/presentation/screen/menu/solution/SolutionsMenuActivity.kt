package sgtmelon.adventofcode.app.presentation.screen.menu.solution

import android.content.Context
import android.content.Intent
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.app.presentation.adapter.DayAdapter
import sgtmelon.adventofcode.app.presentation.model.Day
import sgtmelon.adventofcode.app.presentation.model.Year
import sgtmelon.adventofcode.app.presentation.screen.parent.ParentMenuActivity

class SolutionsMenuActivity : ParentMenuActivity(),
    DayAdapter.Callback {

    override val columnCountId: Int = R.integer.solution_column_count

    private val viewModel: SolutionsMenuViewModel by viewModel<SolutionsMenuViewModelImpl> {
        parametersOf(yearId)
    }

    private val yearId: Int? by lazy { intent.extras?.getInt(::Year.name) }

    override val adapter = DayAdapter(callback = this)

    override fun setupView() {
        super.setupView()

        supportActionBar?.title = getString(R.string.year_title, yearId)
    }

    override fun setupObservers() {
        super.setupObservers()

        viewModel.currentYear.observe(this) {
            if (it != null) adapter.submitList(it.dayList) else finish()
        }
    }

    override fun onDayClick(day: Day) {
        val link = day.classLink ?: return
        startActivity(Intent(this, link))
    }

    companion object {
        operator fun get(context: Context, year: Year): Intent {
            return Intent(context, SolutionsMenuActivity::class.java)
                .putExtra(::Year.name, year.id)
        }
    }
}