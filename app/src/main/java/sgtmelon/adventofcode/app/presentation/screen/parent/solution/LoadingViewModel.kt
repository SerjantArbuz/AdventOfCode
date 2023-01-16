package sgtmelon.adventofcode.app.presentation.screen.parent.solution

import androidx.lifecycle.LiveData

interface LoadingViewModel {

    val isLoading: LiveData<Boolean>

}