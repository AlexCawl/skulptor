package org.alexcawl.sculptor.common.presenter.mock

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.alexcawl.sculptor.common.contract.Identifier
import org.alexcawl.sculptor.common.contract.ModifierContract
import org.alexcawl.sculptor.common.contract.StateContract

@Serializable
@SerialName("mock@state")
data class MockStateContract(
    @SerialName("id")
    override val id: Identifier,
    @SerialName("modifiers")
    override val modifiers: List<ModifierContract>,
    @SerialName("value")
    val value: Mock,
) : StateContract
