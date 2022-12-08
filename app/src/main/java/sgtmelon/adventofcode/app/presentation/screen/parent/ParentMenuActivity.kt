package sgtmelon.adventofcode.app.presentation.screen.parent

import androidx.annotation.IntegerRes
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.ListAdapter
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.databinding.ActivityMenuBinding

abstract class ParentMenuActivity : ParentActivity<ActivityMenuBinding>() {

    override val layoutId: Int = R.layout.activity_menu

    @get:IntegerRes
    abstract val columnCountId: Int

    abstract val adapter: ListAdapter<*, *>

    override fun setupView() {
        super.setupView()

        val columnCount = resources.getInteger(columnCountId)
        binding?.menuRecycler?.also {
            it.setHasFixedSize(true)
            it.layoutManager = GridLayoutManager(it.context, columnCount)
            it.adapter = adapter
        }
    }
}