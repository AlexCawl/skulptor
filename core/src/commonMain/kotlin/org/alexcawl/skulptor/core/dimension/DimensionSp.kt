package org.alexcawl.skulptor.core.dimension

import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("dimension@sp")
data class DimensionSp(
    override val value: Int
) : SDimension<TextUnit> {
    override fun asCompose(): TextUnit = value.sp
}