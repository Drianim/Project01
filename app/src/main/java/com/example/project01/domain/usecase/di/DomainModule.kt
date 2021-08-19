package com.example.project01.domain.usecase.di

import com.example.project01.domain.usecase.*
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface DomainModule {

    @Binds
    fun bindCreateProductUseCase(useCase: CreateProductUseCaseImpl): CreateProductUseCase

    @Binds
    fun bindGetProductsUseCase(useCase: GetProductUseCaseImpl): GetProductsUseCase

    @Binds
    fun bindUploadProductImageUseCase(useCase: UploadProductImageUseCaseImpl): UploadProductImageUseCase
}