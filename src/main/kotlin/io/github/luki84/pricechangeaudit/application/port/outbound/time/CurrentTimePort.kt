package io.github.luki84.pricechangeaudit.application.port.outbound.time

import java.time.Instant

interface CurrentTimePort {
    fun now(): Instant
}
