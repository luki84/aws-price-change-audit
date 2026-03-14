package io.github.luki84.pricechangeaudit.infrastructure.time

import io.github.luki84.pricechangeaudit.application.port.outbound.time.CurrentTimePort
import java.time.Instant

class SystemCurrentTimeAdapter : CurrentTimePort {
    override fun now(): Instant = Instant.now()
}
