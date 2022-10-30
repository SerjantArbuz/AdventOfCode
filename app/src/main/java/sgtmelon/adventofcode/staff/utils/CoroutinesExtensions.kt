package sgtmelon.adventofcode.staff.utils

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch

inline fun CoroutineScope.launchBack(crossinline func: suspend () -> Unit): Job {
    return launch(Dispatchers.IO) { func() }
}

fun <T> Flow<T>.onBack(): Flow<T> = flowOn(Dispatchers.IO)

inline fun <T> Flow<T>.collect(owner: LifecycleOwner, crossinline onCollect: (T) -> Unit) {
    owner.lifecycleScope.launch { collect { onCollect(it) } }
}