package sgtmelon.adventofcode.app.utils

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

inline fun CoroutineScope.launchBack(crossinline func: suspend () -> Unit): Job {
    return launch(Dispatchers.IO) { func() }
}

inline fun <T> Flow<T>.collect(owner: LifecycleOwner, crossinline onCollect: (T) -> Unit) {
    owner.lifecycleScope.launch(Dispatchers.IO) {
        collect { withContext(Dispatchers.Main) { onCollect(it) } }
    }
}

inline fun <T> flowOnBack(crossinline block: suspend FlowCollector<T>.() -> Unit): Flow<T> {
    return flow { block() }.flowOn(Dispatchers.IO)
}