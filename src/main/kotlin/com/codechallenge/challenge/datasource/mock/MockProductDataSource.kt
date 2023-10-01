package com.codechallenge.challenge.datasource

import com.codechallenge.challenge.model.Product
import org.springframework.stereotype.Repository

@Repository
class MockProductDataSource : ProductDataSource {

    val products = listOf(Product("Phone", 100.0, 0,true))
    override fun getProducts(): Collection<Product> = products

}