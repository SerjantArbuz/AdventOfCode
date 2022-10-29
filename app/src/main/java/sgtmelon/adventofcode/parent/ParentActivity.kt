package sgtmelon.adventofcode.parent

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding
import sgtmelon.adventofcode.utils.inflateBinding

abstract class ParentActivity<T : ViewDataBinding> : AppCompatActivity() {

    @get:LayoutRes
    abstract val layoutId: Int

    private var _binding: T? = null
    protected val binding: T? get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = inflateBinding(layoutId)

        setupView()
        setupObservers()
    }

    open fun setupView() = Unit

    open fun setupObservers() = Unit

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}