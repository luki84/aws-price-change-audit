package io.github.luki84.pricechangeaudit.domain.model.pricechange

@JvmInline
value class ProductId(
    val value: String,
) {
    init {
        require(value.isNotBlank()) { "ProductId cannot be blank" }
    }
}
