package sgtmelon.adventofcode.menu

import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import org.koin.androidx.viewmodel.ext.android.viewModel
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.databinding.ActivityMenuBinding
import sgtmelon.adventofcode.menu.adapter.YearAdapter
import sgtmelon.adventofcode.menu.model.Year
import sgtmelon.adventofcode.parent.ParentActivity

class MainMenuActivity : ParentActivity<ActivityMenuBinding>(),
    YearAdapter.Callback {

    override val layoutId: Int = R.layout.activity_menu

    private val viewModel: MainMenuViewModel by viewModel<MainMenuViewModelImpl>()

    private val adapter = YearAdapter(callback = this)

    override fun setupView() {
        super.setupView()

        val columnCount = resources.getInteger(R.integer.menu_column_count)
        binding?.menuRecycler?.also {
            it.setHasFixedSize(true)
            it.layoutManager = GridLayoutManager(it.context, columnCount)
            it.adapter = adapter
        }
    }

    override fun setupObservers() {
        super.setupObservers()
        viewModel.yearList.observe(this) { adapter.submitList(it) }
    }

    override fun onYearClick(year: Year) {
        TODO("Not yet implemented")
    }
}