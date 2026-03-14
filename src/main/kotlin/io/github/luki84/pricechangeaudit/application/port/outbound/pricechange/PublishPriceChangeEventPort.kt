package io.github.luki84.pricechangeaudit.application.port.outbound.pricechange

import io.github.luki84.pricechangeaudit.domain.model.pricechange.PriceChanged

fun interface PublishPriceChangeEventPort {
    fun publish(event: PriceChanged)
}
