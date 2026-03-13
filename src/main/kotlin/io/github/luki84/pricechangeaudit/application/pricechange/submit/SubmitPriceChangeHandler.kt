package io.github.luki84.pricechangeaudit.application.pricechange.submit

import io.github.luki84.pricechangeaudit.application.port.inbound.SubmitPriceChangeUseCase
import io.github.luki84.pricechangeaudit.application.port.outbound.PublishPriceChangeEventPort
import io.github.luki84.pricechangeaudit.domain.model.common.UserId
import io.github.luki84.pricechangeaudit.domain.model.pricechange.EventId
import io.github.luki84.pricechangeaudit.domain.model.pricechange.PriceChangeReason
import io.github.luki84.pricechangeaudit.domain.model.pricechange.PriceChanged
import java.time.Clock
import java.time.Instant

class SubmitPriceChangeHandler(
    private val publishPriceChangeEventPort: PublishPriceChangeEventPort,
    private val clock: Clock = Clock.systemUTC(),
) : SubmitPriceChangeUseCase {
    override fun handle(command: SubmitPriceChangeCommand) {
        publishPriceChangeEventPort.publish(
            PriceChanged(
                eventId = EventId.random(),
                eventVersion = PriceChanged.VERSION,
                occurredAt = Instant.now(clock),
                productId = command.productId,
                oldPrice = command.oldPrice,
                newPrice = command.newPrice,
                changedBy = UserId.of(command.changedBy),
                reason = command.reason?.let { PriceChangeReason.of(it) },
            ),
        )
    }
}
