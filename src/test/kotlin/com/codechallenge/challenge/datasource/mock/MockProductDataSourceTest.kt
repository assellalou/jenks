package com.codechallenge.challenge.datasource.mock

import com.codechallenge.challenge.datasource.MockProductDataSource
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class MockProductDataSourceTest {
    private val mockDataSource =  MockProductDataSource()
    @Test
    fun `must give a collection of products`(){
        //arrange

        //act
        val products = mockDataSource.getProducts()
        //assert
        assertThat(products).isNotEmpty
    }

    @Test
    fun `must provide some mock data`() {
        //arrange

        //act
        val products = mockDataSource.getProducts()


        //assert
        assertThat(products).allMatch { it.name.isNotBlank() }
        assertThat(products).anyMatch { it.isSold } //is true
        assertThat(products).allMatch { it.price > 0 } //is true
        assertThat(products).allMatch { it.price.isFinite() } //finite floating point and is a number


    }
}