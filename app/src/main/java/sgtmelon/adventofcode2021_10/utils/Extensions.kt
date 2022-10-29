package sgtmelon.adventofcode2021_10.utils

import android.app.Activity
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

fun <T : ViewDataBinding> Activity.inflateBinding(@LayoutRes layoutId: Int): T {
    return DataBindingUtil.setContentView(this, layoutId)
}