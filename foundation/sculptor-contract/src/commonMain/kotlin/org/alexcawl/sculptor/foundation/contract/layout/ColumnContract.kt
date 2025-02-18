package org.alexcawl.sculptor.foundation.contract.layout

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.alexcawl.sculptor.common.contract.Identifier
import org.alexcawl.sculptor.common.contract.LayoutContract
import org.alexcawl.sculptor.common.contract.ModifierContract
import org.alexcawl.sculptor.common.contract.StateContract
import org.alexcawl.sculptor.foundation.contract.common.Alignment
import org.alexcawl.sculptor.foundation.contract.common.Arrangement

@Serializable
@SerialName("column@layout")
public data class ColumnLayoutContract(
    override val id: Identifier,
    override val state: Identifier,
    override val modifiers: List<ModifierContract>,
    override val states: List<ColumnStateContract>
) : LayoutContract

@Serializable
@SerialName("column@state")
public data class ColumnStateContract(
    override val id: Identifier,
    override val modifiers: List<ModifierContract>,
    @SerialName("vertical_arrangement")
    val verticalArrangement: Arrangement.Vertical,
    @SerialName("horizontal_alignment")
    val horizontalAlignment: Alignment.Horizontal,
    @SerialName("content")
    val content: List<Identifier>,
) : StateContract
