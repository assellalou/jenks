package com.codechallenge.challenge.datasource

import com.codechallenge.challenge.model.Product

interface ProductDataSource {
    fun getProducts() : Collection<Product>
}