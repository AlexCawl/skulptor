package org.alexcawl.sculptor.foundation.contract.value

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.alexcawl.sculptor.common.contract.Identifier

/**
 * TODO: docs
 */
@Serializable
public class IntValueContract(
    @SerialName("id")
    override val id: Identifier,
    @SerialName("value")
    override val value: Int
) : NumberValueContract()
