package com.example.project01.ui.products

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.project01.config.Config
import com.example.project01.domain.model.Product
import com.example.project01.domain.usecase.GetProductsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductsViewModel @Inject constructor(
    private val getProductsUseCase: GetProductsUseCase,
    private val config: Config
) : ViewModel() {

    private val _productsData = MutableLiveData<List<Product>>()
    val productData: LiveData<List<Product>> = _productsData

    private val _addButtonVisibilityData = MutableLiveData(config.addButtonVisibility)
    val addButtonVisibilityData: LiveData<Int> = _addButtonVisibilityData

    fun getProducts() = viewModelScope.launch {
        try {
            val products = getProductsUseCase()
            _productsData.value = products
        } catch (e : Exception) {
            Log.d("ProductsViewModel", e.toString())
        }
    }
}