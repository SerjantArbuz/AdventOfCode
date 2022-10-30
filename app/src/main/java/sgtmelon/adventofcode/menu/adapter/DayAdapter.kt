package sgtmelon.adventofcode.menu.adapter

import android.view.ViewGroup
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.menu.adapter.diff.DayDiff
import sgtmelon.adventofcode.menu.adapter.holder.DayHolder
import sgtmelon.adventofcode.menu.model.Day
import sgtmelon.adventofcode.parent.adapter.ParentAdapter
import sgtmelon.adventofcode.utils.inflateBinding

class DayAdapter(
    private val callback: Callback
) : ParentAdapter<Day, DayHolder>(DayDiff()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DayHolder {
        return DayHolder(parent.inflateBinding(R.layout.item_button))
    }

    override fun onBindViewHolder(holder: DayHolder, position: Int) {
        holder.bind(getItem(position), callback)
    }

    interface Callback : DayHolder.Callback
}