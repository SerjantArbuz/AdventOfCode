package sgtmelon.adventofcode.staff.menu.adapter.diff

import androidx.recyclerview.widget.DiffUtil
import sgtmelon.adventofcode.staff.menu.model.Year

class YearDiff : DiffUtil.ItemCallback<Year>() {

    override fun areItemsTheSame(oldItem: Year, newItem: Year): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Year, newItem: Year): Boolean {
        return oldItem == newItem
    }
}