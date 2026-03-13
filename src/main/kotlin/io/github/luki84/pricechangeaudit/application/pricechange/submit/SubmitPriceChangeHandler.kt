package io.github.luki84.pricechangeaudit.application.pricechange.submit

import io.github.luki84.pricechangeaudit.application.port.inbound.SubmitPriceChangeUseCase
import io.github.luki84.pricechangeaudit.application.port.outbound.PublishPriceChangeSubmitted
import io.github.luki84.pricechangeaudit.domain.model.pricechange.EventId
import io.github.luki84.pricechangeaudit.domain.model.pricechange.PriceEventType
import io.github.luki84.pricechangeaudit.domain.model.pricechange.ProductPriceChanged
import java.time.Clock
import java.time.Instant

class SubmitPriceChangeHandler(
    private val publishPriceChangeSubmitted: PublishPriceChangeSubmitted,
    private val clock: Clock = Clock.systemUTC(),
) : SubmitPriceChangeUseCase {
    override fun handle(command: SubmitPriceChangeCommand) {
        publishPriceChangeSubmitted.publish(
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
