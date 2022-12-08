package sgtmelon.adventofcode.app.menu.adapter

import android.view.ViewGroup
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.app.menu.adapter.diff.YearDiff
import sgtmelon.adventofcode.app.menu.adapter.holder.YearHolder
import sgtmelon.adventofcode.app.menu.model.Year
import sgtmelon.adventofcode.app.parent.adapter.ParentAdapter
import sgtmelon.adventofcode.app.utils.inflateBinding

class YearAdapter(
    private val callback: Callback
) : ParentAdapter<Year, YearHolder>(YearDiff()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YearHolder {
        return YearHolder(parent.inflateBinding(R.layout.item_button))
    }

    override fun onBindViewHolder(holder: YearHolder, position: Int) {
        holder.bind(getItem(position), callback)
    }

    interface Callback : YearHolder.Callback
}