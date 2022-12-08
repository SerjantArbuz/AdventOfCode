package sgtmelon.adventofcode.app.presentation.screen.menu.main

import androidx.lifecycle.LiveData
import sgtmelon.adventofcode.app.presentation.model.Year

interface MainMenuViewModel {

    val yearList: LiveData<List<Year>>

}