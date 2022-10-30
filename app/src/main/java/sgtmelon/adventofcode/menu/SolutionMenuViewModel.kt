package sgtmelon.adventofcode.menu

import androidx.lifecycle.LiveData
import sgtmelon.adventofcode.menu.model.Year

interface SolutionMenuViewModel {

    val currentYear: LiveData<Year?>

}