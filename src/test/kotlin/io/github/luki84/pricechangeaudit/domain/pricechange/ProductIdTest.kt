package io.github.luki84.pricechangeaudit.domain.pricechange

import io.github.luki84.pricechangeaudit.domain.model.pricechange.ProductId
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ProductIdTest {
    @Test
    fun `should create valid ProductId`() {
        val productId = ProductId("123")
        assertNotNull(productId)
    }

    @Test
    fun `should not create ProductId with blank value`() {
        assertThrows(IllegalArgumentException::class.java) {
            ProductId(" ")
        }
    }
}
