package sgtmelon.adventofcode.staff.menu

import androidx.lifecycle.LiveData
import sgtmelon.adventofcode.staff.menu.model.Year

interface MainMenuViewModel {

    val yearList: LiveData<List<Year>>

}