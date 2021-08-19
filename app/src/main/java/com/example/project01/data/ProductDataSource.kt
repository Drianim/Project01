package com.example.project01.data

import android.net.Uri
import com.example.project01.domain.model.Product

interface ProductDataSource {

    suspend fun getProducts(): List<Product>

    suspend fun uploadProductImage(imageUri: Uri): String

    suspend fun createProduct(product: Product): Product
}