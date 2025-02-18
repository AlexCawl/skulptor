package org.alexcawl.sculptor.foundation.contract

import kotlinx.serialization.KSerializer
import kotlinx.serialization.StringFormat
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals

abstract class SerializationTest<V> {
    private val format: StringFormat
        get() = Json {
            prettyPrint = true
        }

    abstract val value: V
    abstract val string: String
    abstract val serializer: KSerializer<V>

    @Test
    fun serializationTest() {
        val actual = format.encodeToString(serializer, value)
        val expected = string
        assertEquals(
            expected = expected,
            actual = actual,
            message = "Serialization failed",
        )
    }

    @Test
    fun deserializationTest() {
        val actual = format.decodeFromString(serializer, string)
        val expected = value
        assertEquals(
            expected = expected,
            actual = actual,
            message = "Deserialization failed",
        )
    }
}
