package com.example.project01.domain.usecase

import com.example.project01.data.ProductRepository
import com.example.project01.domain.model.Product
import javax.inject.Inject

class GetProductUseCaseImpl @Inject constructor(
    private val productRepository: ProductRepository
) : GetProductsUseCase {

    override suspend fun invoke(): List<Product> {
        return productRepository.getProducts()
    }
}