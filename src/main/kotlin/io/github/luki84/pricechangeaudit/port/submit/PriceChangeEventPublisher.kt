package io.github.luki84.pricechangeaudit.port.submit

import io.github.luki84.pricechangeaudit.domain.model.ProductPriceChanged

fun interface PriceChangeEventPublisher {
    fun publish(event: ProductPriceChanged)
}
