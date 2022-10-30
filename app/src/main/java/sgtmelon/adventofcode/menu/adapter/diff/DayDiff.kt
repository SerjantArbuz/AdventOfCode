package sgtmelon.adventofcode.menu.adapter.diff

import androidx.recyclerview.widget.DiffUtil
import sgtmelon.adventofcode.menu.model.Day

class DayDiff : DiffUtil.ItemCallback<Day>() {

    override fun areItemsTheSame(oldItem: Day, newItem: Day): Boolean {
        return oldItem.i == newItem.i
    }

    override fun areContentsTheSame(oldItem: Day, newItem: Day): Boolean {
        return oldItem == newItem
    }
}