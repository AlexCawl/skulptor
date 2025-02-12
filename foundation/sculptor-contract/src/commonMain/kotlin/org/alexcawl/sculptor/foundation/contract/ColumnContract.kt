package org.alexcawl.sculptor.foundation.contract

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.alexcawl.sculptor.common.contract.Identifier
import org.alexcawl.sculptor.common.contract.layout.LayoutContract
import org.alexcawl.sculptor.common.contract.layout.ModifierContract
import org.alexcawl.sculptor.common.contract.layout.StateContract
import org.alexcawl.sculptor.foundation.contract.property.Alignment
import org.alexcawl.sculptor.foundation.contract.property.Arrangement

@Serializable
@SerialName("column@contract")
data class ColumnContract : LayoutContract<ColumnState>() {

}

@Serializable
@SerialName("column@state")
data class ColumnState(
    @SerialName("id")
    override val id: Identifier,
    @SerialName("modifiers")
    override val modifiers: List<ModifierContract>,
    @SerialName("vertical_arrangement")
    val verticalArrangement: Arrangement.Vertical,
    @SerialName("horizontal_alignment")
    val horizontalAlignment: Alignment.Horizontal,
    @SerialName("content")
    val content: List<String>,
) : StateContract
