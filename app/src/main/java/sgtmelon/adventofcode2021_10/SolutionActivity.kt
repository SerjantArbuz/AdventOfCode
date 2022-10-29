package sgtmelon.adventofcode2021_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import sgtmelon.adventofcode2021_10.utils.inflateBinding
import org.koin.androidx.viewmodel.ext.android.viewModel
import sgtmelon.adventofcode2021_10.databinding.ActivitySolutionBinding

class SolutionActivity : AppCompatActivity() {

    private val viewModel: SolutionViewModel by viewModel<SolutionViewModelImpl>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = inflateBinding<ActivitySolutionBinding>(R.layout.activity_solution)

        viewModel.corruptedPoints.observe(this) {
            binding.resultFirstText.text = it.toString()
        }
        viewModel.incompletePoints.observe(this) {
            binding.resultSecondText.text = it.toString()
        }
    }
}