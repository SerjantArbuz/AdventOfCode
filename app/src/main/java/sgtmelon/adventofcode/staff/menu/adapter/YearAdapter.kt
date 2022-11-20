package sgtmelon.adventofcode.staff.menu.adapter

import android.view.ViewGroup
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.staff.menu.adapter.diff.YearDiff
import sgtmelon.adventofcode.staff.menu.adapter.holder.YearHolder
import sgtmelon.adventofcode.staff.menu.model.Year
import sgtmelon.adventofcode.staff.parent.adapter.ParentAdapter
import sgtmelon.adventofcode.staff.utils.inflateBinding

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