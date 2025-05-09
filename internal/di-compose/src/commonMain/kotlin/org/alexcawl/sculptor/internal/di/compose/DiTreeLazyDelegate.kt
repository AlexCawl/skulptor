package org.alexcawl.sculptor.internal.di.compose

import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner
import org.alexcawl.sculptor.internal.di.DiTree
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

internal class DiTreeLazyDelegate(
    private val viewModelKey: String,
    private val factory: () -> DiTree,
) : ReadOnlyProperty<ViewModelStoreOwner, DiTree> {
    private var value: DiTree? = null

    override fun getValue(thisRef: ViewModelStoreOwner, property: KProperty<*>): DiTree {
        return value ?: run {
            val viewModelStore: ViewModelStore = thisRef.viewModelStore
            val diTreeViewModel: DiTreeViewModel = viewModelStore.get(key = viewModelKey) {
                DiTreeViewModel(diTree = factory())
            }
            diTreeViewModel.also { diTree: DiTree ->
                value = diTree
            }
        }
    }
}
