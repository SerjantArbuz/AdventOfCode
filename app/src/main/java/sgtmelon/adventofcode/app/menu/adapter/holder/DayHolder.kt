package sgtmelon.adventofcode.app.menu.adapter.holder

import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.app.menu.model.Day
import sgtmelon.adventofcode.app.parent.adapter.ParentHolder
import sgtmelon.adventofcode.databinding.ItemButtonBinding

class DayHolder(
    private val binding: ItemButtonBinding
) : ParentHolder(binding){

    fun bind(day: Day, callback: Callback) = with(binding) {
        button.text = context.getString(R.string.day_complete, day.id, day.solution.point)
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