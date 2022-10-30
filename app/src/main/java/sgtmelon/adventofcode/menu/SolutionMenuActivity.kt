package sgtmelon.adventofcode.menu

import android.content.Context
import android.content.Intent
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.menu.adapter.DayAdapter
import sgtmelon.adventofcode.menu.model.Day
import sgtmelon.adventofcode.menu.model.Year
import sgtmelon.adventofcode.parent.ParentMenuActivity

class SolutionMenuActivity : ParentMenuActivity(),
    DayAdapter.Callback {

    override val columnCountId: Int = R.integer.solution_column_count

    private val viewModel: SolutionMenuViewModel by viewModel<SolutionMenuViewModelImpl> {
        parametersOf(yearId)
    }

    private val yearId: Int? by lazy { intent.extras?.getInt(::Year.name) }

    override val adapter = DayAdapter(callback = this)

    override fun setupObservers() {
        super.setupObservers()

        viewModel.currentYear.observe(this) {
            if (it != null) {
                actionBar?.title = getString(R.string.year_title, it.id)
                adapter.submitList(it.dayList)
            } else {
                finish()
            }
        }
    }

    override fun onDayClick(day: Day) {
        val link = day.classLink ?: return
        startActivity(Intent(this, link))
    }

    companion object {
        operator fun get(context: Context, year: Year): Intent {
            return Intent(context, SolutionMenuActivity::class.java)
                .putExtra(::Year.name, year.id)
        }
    }
}