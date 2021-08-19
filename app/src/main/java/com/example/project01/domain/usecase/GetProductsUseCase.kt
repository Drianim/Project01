package com.example.project01.domain.usecase

import com.example.project01.domain.model.Product

interface GetProductsUseCase {

    suspend operator fun invoke(): List<Product>
}