package sgtmelon.adventofcode.staff.menu.adapter.holder

import sgtmelon.adventofcode.databinding.ItemButtonBinding
import sgtmelon.adventofcode.staff.menu.model.Year
import sgtmelon.adventofcode.staff.parent.adapter.ParentHolder

class YearHolder(
    private val binding: ItemButtonBinding
) : ParentHolder(binding) {

    fun bind(year: Year, callback: Callback) = with(binding) {
        button.text = year.id.toString()
        button.isEnabled = year.isAvailable
        button.setOnClickListener { callback.onYearClick(year) }
    }

    override fun unbind() {
        binding.button.setOnClickListener(null)
    }

    interface Callback {
        fun onYearClick(year: Year)
    }
}