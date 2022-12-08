package sgtmelon.adventofcode.app.presentation.adapter.diff

import androidx.recyclerview.widget.DiffUtil
import sgtmelon.adventofcode.app.presentation.model.Day

class DayDiff : DiffUtil.ItemCallback<Day>() {

    override fun areItemsTheSame(oldItem: Day, newItem: Day): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Day, newItem: Day): Boolean {
        return oldItem == newItem
    }
}