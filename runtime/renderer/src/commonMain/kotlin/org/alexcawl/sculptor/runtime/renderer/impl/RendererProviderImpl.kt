package org.alexcawl.sculptor.runtime.renderer.impl

import org.alexcawl.sculptor.core.layout.UiState
import org.alexcawl.sculptor.core.renderer.Renderer
import org.alexcawl.sculptor.runtime.renderer.RendererProvider
import kotlin.reflect.KClass

public class RendererProviderImpl(
    private val renderers: List<Renderer<UiState>>,
) : RendererProvider {
    override fun findRenderer(uiStateClass: KClass<out UiState>): Renderer<UiState> {
        return renderers
            .find { it.state == uiStateClass }
            ?: error(message = "Cannot resolve renderer for state $uiStateClass")
    }
}
