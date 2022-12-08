package sgtmelon.adventofcode.app.presentation.screen.parent.solution

import androidx.lifecycle.LiveData

interface LoadingViewModel {

    val loading: LiveData<Boolean>

}