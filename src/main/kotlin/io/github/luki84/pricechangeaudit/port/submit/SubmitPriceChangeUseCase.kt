package io.github.luki84.pricechangeaudit.port.submit

import io.github.luki84.pricechangeaudit.application.submit.SubmitPriceChangeCommand

fun interface SubmitPriceChangeUseCase {
    fun handle(command: SubmitPriceChangeCommand)
}
