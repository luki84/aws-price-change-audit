package io.github.luki84.pricechangeaudit.application.submit

import io.github.luki84.pricechangeaudit.domain.model.PriceEventType
import io.github.luki84.pricechangeaudit.domain.model.ProductPriceChanged
import io.github.luki84.pricechangeaudit.domain.valueobject.EventId
import io.github.luki84.pricechangeaudit.port.submit.PriceChangeEventPublisher
import io.github.luki84.pricechangeaudit.port.submit.SubmitPriceChangeUseCase
import java.time.Clock
import java.time.Instant

class SubmitPriceChangeHandler(
    private val priceChangeEventPublisher: PriceChangeEventPublisher,
    private val clock: Clock = Clock.systemUTC(),
) : SubmitPriceChangeUseCase {
    override fun handle(command: SubmitPriceChangeCommand) {
        priceChangeEventPublisher.publish(
            ProductPriceChanged(
                eventId = EventId.random(),
                eventType = PriceEventType.PRODUCT_PRICE_CHANGED,
                eventVersion = ProductPriceChanged.VERSION,
                occurredAt = Instant.now(clock),
                productId = command.productId,
                oldPrice = command.oldPrice,
                newPrice = command.newPrice,
                changedBy = command.changedBy,
                reason = command.reason,
            ),
        )
    }
}
