package sgtmelon.adventofcode.parent.adapter

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class ParentHolder(binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root),
        UnbindCallback