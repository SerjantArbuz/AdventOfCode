package sgtmelon.adventofcode.app.presentation.adapter

import android.view.ViewGroup
import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.app.presentation.adapter.diff.DayDiff
import sgtmelon.adventofcode.app.presentation.adapter.holder.DayHolder
import sgtmelon.adventofcode.app.presentation.adapter.parent.ParentAdapter
import sgtmelon.adventofcode.app.presentation.model.Day
import sgtmelon.adventofcode.app.utils.inflateBinding

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