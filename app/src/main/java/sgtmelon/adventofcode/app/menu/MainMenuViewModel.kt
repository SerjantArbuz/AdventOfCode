package sgtmelon.adventofcode.app.menu

import androidx.lifecycle.LiveData
import sgtmelon.adventofcode.app.menu.model.Year

interface MainMenuViewModel {

    val yearList: LiveData<List<Year>>

}