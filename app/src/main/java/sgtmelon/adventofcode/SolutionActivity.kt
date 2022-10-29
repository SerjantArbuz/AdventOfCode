package sgtmelon.adventofcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import sgtmelon.adventofcode.utils.inflateBinding
import org.koin.androidx.viewmodel.ext.android.viewModel
import sgtmelon.adventofcode.databinding.ActivitySolutionBinding

/**
 * 2021 Day 10. Takes around ~2 hours for both puzzle parts.
 */
class SolutionActivity : AppCompatActivity() {

    private val viewModel: SolutionViewModel by viewModel<SolutionViewModelImpl>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = inflateBinding<ActivitySolutionBinding>(R.layout.activity_solution)

        viewModel.corruptedPoints.observe(this) {
            binding.corruptedText.text = it.toString()
        }
        viewModel.incompletePoints.observe(this) {
            binding.incompleteText.text = it.toString()
        }
    }
}