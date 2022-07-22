package com.nazmul.data.repository

import com.nazmul.data.mappers.toDomain
import com.nazmul.data.network.ApiService
import com.nazmul.data.network.utils.SafeApiRequest
import com.nazmul.domain.model.Blog
import com.nazmul.domain.repository.GetBlogsRepository
import javax.inject.Inject

class GetBlogsRepositoryImpl @Inject constructor(private val apiService: ApiService): GetBlogsRepository, SafeApiRequest() {

    override suspend fun getBlogs(): List<Blog> {
        val response = safeApiRequest { apiService.getBlogs() }
        return response.data?.toDomain()?: emptyList()
    }
}