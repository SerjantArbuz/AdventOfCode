package sgtmelon.adventofcode.app.presentation.screen.menu.solution

import androidx.lifecycle.LiveData
import sgtmelon.adventofcode.app.presentation.model.Year

interface SolutionsMenuViewModel {

    val currentYear: LiveData<Year?>

}