package io.github.luki84.pricechangeaudit.domain.pricechange

import io.github.luki84.pricechangeaudit.domain.model.pricechange.EventId
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class EventIdTest {
    @Test
    fun `should create valid EventId`() {
        val eventId = EventId.random()
        assertNotNull(eventId)
    }

    @Test
    fun `should create EventId from valid string`() {
        val eventId = EventId.of("  valid-event-id  ")
        assertNotNull(eventId)
    }
}
