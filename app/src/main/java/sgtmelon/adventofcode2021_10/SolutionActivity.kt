package sgtmelon.adventofcode2021_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import sgtmelon.adventofcode2021_10.databinding.ActivityMainBinding
import sgtmelon.adventofcode2021_10.utils.inflateBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class SolutionActivity : AppCompatActivity() {

    private val viewModel: SolutionViewModelImpl by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = inflateBinding<ActivityMainBinding>(R.layout.activity_main)

        lifecycleScope.launchWhenResumed {
            viewModel.getResult(PuzzleInput.input).collect {
                binding.resultText.text = it.toString()
            }
        }
    }
}