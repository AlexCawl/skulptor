package org.alexcawl.sculptor.foundation.presenter.common.arrangement

import org.alexcawl.sculptor.core.presenter.Presenter
import org.alexcawl.sculptor.core.presenter.PresenterScope
import org.alexcawl.sculptor.core.presenter.map
import kotlin.reflect.KClass
import androidx.compose.foundation.layout.Arrangement as ComposeArrangement
import androidx.compose.ui.Alignment as ComposeAlignment
import org.alexcawl.sculptor.foundation.contract.common.Alignment as SculptorAlignment
import org.alexcawl.sculptor.foundation.contract.common.Arrangement as SculptorArrangement

public class ArrangementVerticalPresenter : Presenter<SculptorArrangement.Vertical, ComposeArrangement.Vertical>() {
    override val input: KClass<SculptorArrangement.Vertical> = SculptorArrangement.Vertical::class
    override val output: KClass<ComposeArrangement.Vertical> = ComposeArrangement.Vertical::class

    public override suspend fun PresenterScope.dslTransform(input: SculptorArrangement.Vertical): ComposeArrangement.Vertical {
        return when (input) {
            SculptorArrangement.Vertical.Top -> ComposeArrangement.Top
            SculptorArrangement.Vertical.Center -> ComposeArrangement.Center
            SculptorArrangement.Vertical.Bottom -> ComposeArrangement.Bottom

            is SculptorArrangement.Vertical.Aligned -> ComposeArrangement.aligned(
                alignment = map<SculptorAlignment.Vertical, ComposeAlignment.Vertical>(
                    input = input.alignment
                )
            )

            is SculptorArrangement.Vertical.SpacedBy -> ComposeArrangement.spacedBy(
                space = map(input.space)
            )
        }
    }
}
