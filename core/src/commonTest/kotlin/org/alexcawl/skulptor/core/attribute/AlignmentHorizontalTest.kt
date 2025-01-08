package org.alexcawl.skulptor.core.attribute

import org.alexcawl.skulptor.core.BaseSerializationTest
import org.alexcawl.skulptor.core.provider.AlignmentWrapper
import org.junit.Test

class AlignmentHorizontalTest : BaseSerializationTest() {
    private inline fun serializationTest(
        identifier: String,
        factory: () -> AlignmentWrapper.Horizontal
    ) = baseSerializationTest(
        string = """{"type":"alignment@${identifier}"}""",
        factory = factory
    )

    @Test
    fun `Test Alignment_Start`() = serializationTest(
        identifier = "start",
        factory = { AlignmentWrapper.Horizontal.Start }
    )

    @Test
    fun `Test Alignment_CenterHorizontally`() = serializationTest(
        identifier = "center_horizontally",
        factory = { AlignmentWrapper.Horizontal.CenterHorizontally }
    )

    @Test
    fun `Test Alignment_End`() = serializationTest(
        identifier = "end",
        factory = { AlignmentWrapper.Horizontal.End }
    )
}
