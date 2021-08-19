package com.example.project01.domain.usecase

import android.net.Uri
import com.example.project01.domain.model.Product

interface CreateProductUseCase {

    suspend operator fun invoke(description: String, price: Double, imageUri: Uri): Product
}