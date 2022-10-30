package sgtmelon.adventofcode.parent.adapter

import android.content.Context
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class ParentHolder(binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root),
    UnbindCallback {

    protected val context: Context get() = itemView.context

}