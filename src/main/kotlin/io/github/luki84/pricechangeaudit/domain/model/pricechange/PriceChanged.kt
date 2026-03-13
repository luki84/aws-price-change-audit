package io.github.luki84.pricechangeaudit.domain.model.pricechange

import io.github.luki84.pricechangeaudit.domain.model.common.UserId
import io.github.luki84.pricechangeaudit.domain.model.money.Money
import java.time.Instant

data class PriceChanged(
    val eventId: EventId,
    val eventType: String = PRODUCT_PRICE_CHANGED,
    val eventVersion: Int,
    val occurredAt: Instant,
    val productId: ProductId,
    val oldPrice: Money,
    val newPrice: Money,
    val changedBy: UserId,
    val reason: PriceChangeReason?,
) {
    companion object {
        private const val PRODUCT_PRICE_CHANGED = "PRODUCT_PRICE_CHANGED"
        const val VERSION = 1
    }
}
