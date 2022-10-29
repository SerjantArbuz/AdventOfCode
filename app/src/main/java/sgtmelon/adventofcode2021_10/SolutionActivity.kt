package sgtmelon.adventofcode2021_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import sgtmelon.adventofcode2021_10.databinding.ActivityMainBinding
import sgtmelon.adventofcode2021_10.utils.inflateBinding

class SolutionActivity : AppCompatActivity() {

    private val viewModel: SolutionViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = inflateBinding<ActivityMainBinding>(R.layout.activity_main)

        lifecycleScope.launch {
            viewModel.getResult(PuzzleInput.input).collect {
                binding.resultText.text = it.toString()
            }
        }
    }
}