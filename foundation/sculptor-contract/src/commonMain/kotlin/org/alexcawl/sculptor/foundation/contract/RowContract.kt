package org.alexcawl.sculptor.foundation.contract

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.alexcawl.sculptor.common.contract.layout.LayoutContract
import org.alexcawl.sculptor.common.contract.layout.ModifierContract
import org.alexcawl.sculptor.foundation.contract.property.Alignment
import org.alexcawl.sculptor.foundation.contract.property.Arrangement

@Serializable
@SerialName("state@row")
data class RowContract(
    @SerialName("id")
    override val id: String,
    @SerialName("modifiers")
    override val modifiers: List<ModifierContract>,
    @SerialName("horizontal_arrangement")
    val horizontalArrangement: Arrangement.Horizontal,
    @SerialName("vertical_alignment")
    val verticalAlignment: Alignment.Vertical,
    @SerialName("content")
    val content: List<String>,
) : LayoutContract
