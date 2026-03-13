package io.github.luki84.pricechangeaudit.domain.model

import io.github.luki84.pricechangeaudit.domain.valueobject.EventId
import io.github.luki84.pricechangeaudit.domain.valueobject.Money
import io.github.luki84.pricechangeaudit.domain.valueobject.ProductId
import java.time.Instant

data class ProductPriceChanged(
    val eventId: EventId,
    val eventType: PriceEventType,
    val eventVersion: Int,
    val occurredAt: Instant,
    val productId: ProductId,
    val oldPrice: Money,
    val newPrice: Money,
    val changedBy: String,
    val reason: String?,
) {
    companion object {
        const val VERSION = 1
    }
}
