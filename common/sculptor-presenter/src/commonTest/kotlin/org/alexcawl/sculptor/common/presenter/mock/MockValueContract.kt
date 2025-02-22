package org.alexcawl.sculptor.common.presenter.mock

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.alexcawl.sculptor.common.contract.Identifier
import org.alexcawl.sculptor.common.contract.ValueContract

@Serializable
@SerialName("mock@value")
data class MockValueContract(
    @SerialName("id")
    override val id: Identifier,
    @SerialName("value")
    override val value: Mock,
) : ValueContract
