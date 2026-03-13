package io.github.luki84.pricechangeaudit.application.port.inbound

import io.github.luki84.pricechangeaudit.application.pricechange.submit.SubmitPriceChangeCommand

fun interface SubmitPriceChangeUseCase {
    fun handle(command: SubmitPriceChangeCommand)
}
