package sgtmelon.adventofcode.app.menu.adapter.holder

import sgtmelon.adventofcode.R
import sgtmelon.adventofcode.app.menu.model.Year
import sgtmelon.adventofcode.app.parent.adapter.ParentHolder
import sgtmelon.adventofcode.databinding.ItemButtonBinding

class YearHolder(
    private val binding: ItemButtonBinding
) : ParentHolder(binding) {

    fun bind(year: Year, callback: Callback) = with(binding) {
        button.text = context.getString(R.string.year_complete, year.id, year.doneCount)
        button.isEnabled = year.doneCount != 0
        button.setOnClickListener { callback.onYearClick(year) }
    }

    override fun unbind() {
        binding.button.setOnClickListener(null)
    }

    interface Callback {
        fun onYearClick(year: Year)
    }
}