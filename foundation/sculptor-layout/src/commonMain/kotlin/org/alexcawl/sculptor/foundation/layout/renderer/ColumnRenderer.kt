package org.alexcawl.sculptor.foundation.layout.renderer

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import org.alexcawl.sculptor.common.layout.Layout
import org.alexcawl.sculptor.common.layout.Renderer
import org.alexcawl.sculptor.common.layout.RendererScope
import org.alexcawl.sculptor.foundation.layout.ColumnLayout

class ColumnRenderer : Renderer<ColumnLayout>() {
    @Composable
    override fun RendererScope.Render(layout: ColumnLayout) {
        Column(
            modifier = layout.modifier,
            verticalArrangement = layout.verticalArrangement,
            horizontalAlignment = layout.horizontalAlignment,
            content = {
                layout.content.forEach { layout: Layout ->
                    render(layout)
                }
            }
        )
    }
}
