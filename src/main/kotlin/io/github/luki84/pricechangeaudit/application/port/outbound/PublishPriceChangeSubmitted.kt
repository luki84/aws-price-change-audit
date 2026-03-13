package io.github.luki84.pricechangeaudit.application.port.outbound

import io.github.luki84.pricechangeaudit.domain.model.pricechange.ProductPriceChanged

fun interface PublishPriceChangeSubmitted {
    fun publish(event: ProductPriceChanged)
}
