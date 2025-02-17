package org.alexcawl.sculptor.common.presenter

import androidx.compose.ui.Modifier
import org.alexcawl.sculptor.common.contract.ModifierContract
import kotlin.reflect.KClass

/**
 * TODO: docs
 */
public abstract class ModifierPresenter<Input : ModifierContract> : CommonPresenter<Input, Modifier>() {
    /**
     * TODO: docs
     */
    final override val output: KClass<Modifier> = Modifier::class
}
