package io.github.luki84.pricechangeaudit.application.submit

import io.github.luki84.pricechangeaudit.domain.valueobject.Money
import io.github.luki84.pricechangeaudit.domain.valueobject.ProductId

data class SubmitPriceChangeCommand(
    val productId: ProductId,
    val oldPrice: Money,
    val newPrice: Money,
    val changedBy: String,
    val reason: String?,
) {
    init {
        require(oldPrice.currency == newPrice.currency) {
            "Old price and new price must use the same currency"
        }
        require(oldPrice.amount.compareTo(newPrice.amount) != 0) {
            "Old price and new price must be different"
        }
        require(changedBy.isNotBlank()) {
            "changedBy cannot be blank"
        }
    }
}
