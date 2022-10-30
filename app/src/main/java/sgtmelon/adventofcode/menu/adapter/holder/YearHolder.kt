package sgtmelon.adventofcode.menu.adapter.holder

import androidx.recyclerview.widget.RecyclerView
import sgtmelon.adventofcode.databinding.ItemYearBinding
import sgtmelon.adventofcode.menu.model.Year
import sgtmelon.adventofcode.parent.adapter.ParentHolder
import sgtmelon.adventofcode.parent.adapter.UnbindCallback

class YearHolder(
    private val binding: ItemYearBinding
) : ParentHolder(binding) {

    fun bind(year: Year, callback: Callback) = with(binding) {
        button.text = year.i.toString()
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