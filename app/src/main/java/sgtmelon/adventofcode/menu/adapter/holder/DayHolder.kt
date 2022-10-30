package sgtmelon.adventofcode.menu.adapter.holder

import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.databinding.ItemButtonBinding
import sgtmelon.adventofcode.menu.model.Day
import sgtmelon.adventofcode.parent.adapter.ParentHolder

class DayHolder(
    private val binding: ItemButtonBinding
) : ParentHolder(binding){

    fun bind(day: Day, callback: Callback) = with(binding) {
        button.text = root.context.getString(R.string.day_complete, day.id, day.solution.point)
        button.isEnabled = day.isAvailable
        button.setOnClickListener { callback.onDayClick(day) }
    }

    override fun unbind() {
        binding.button.setOnClickListener(null)
    }

    interface Callback {
        fun onDayClick(day: Day)
    }
}