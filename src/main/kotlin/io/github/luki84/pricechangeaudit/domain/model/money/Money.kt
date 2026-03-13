package io.github.luki84.pricechangeaudit.domain.model.money

import java.math.BigDecimal

class Money private constructor(
    val amount: BigDecimal,
    val currency: CurrencyCode,
) {
    init {
        require(amount > BigDecimal.ZERO) { "Money amount must be positive" }
        require(amount.scale() <= 2) { "Money amount must have at most 2 decimal places" }
    }

    companion object {
        fun of(
            amount: BigDecimal,
            currency: CurrencyCode,
        ): Money = Money(amount, currency)
    }

    override fun toString(): String = "$amount $currency"
}
