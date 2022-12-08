package sgtmelon.adventofcode.app.parent.solution

import androidx.lifecycle.LiveData

interface LoadingViewModel {

    val loading: LiveData<Boolean>

}