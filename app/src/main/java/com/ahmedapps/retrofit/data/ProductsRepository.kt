package com.ahmedapps.retrofit.data

import com.ahmedapps.retrofit.data.model.Product
import kotlinx.coroutines.flow.Flow


interface ProductsRepository {
    suspend fun getProductsList(): Flow<Result<List<Product>>>
}