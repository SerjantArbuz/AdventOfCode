package sgtmelon.adventofcode.menu

import androidx.lifecycle.LiveData
import sgtmelon.adventofcode.menu.model.Year

interface MainMenuViewModel {

    val yearList: LiveData<List<Year>>
}