package com.example.project01.domain.usecase

import android.net.Uri

interface UploadProductImageUseCase {

    suspend operator fun invoke(imageUri: Uri): String
}