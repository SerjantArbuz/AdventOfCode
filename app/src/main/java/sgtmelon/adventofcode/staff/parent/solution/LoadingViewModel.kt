package sgtmelon.adventofcode.staff.parent.solution

import androidx.lifecycle.LiveData

interface LoadingViewModel {

    val loading: LiveData<Boolean>

}