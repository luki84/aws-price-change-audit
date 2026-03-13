package io.github.luki84.pricechangeaudit.domain.model.pricechange

import io.github.luki84.pricechangeaudit.domain.model.money.Money
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
