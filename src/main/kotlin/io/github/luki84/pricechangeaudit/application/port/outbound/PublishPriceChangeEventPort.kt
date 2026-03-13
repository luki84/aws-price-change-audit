package io.github.luki84.pricechangeaudit.application.port.outbound

import io.github.luki84.pricechangeaudit.domain.model.pricechange.PriceChanged

fun interface PublishPriceChangeEventPort {
    fun publish(event: PriceChanged)
}
