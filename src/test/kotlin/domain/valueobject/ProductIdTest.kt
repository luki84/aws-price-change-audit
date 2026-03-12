package domain.valueobject

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
