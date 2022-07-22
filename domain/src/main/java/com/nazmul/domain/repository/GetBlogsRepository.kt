package com.nazmul.domain.repository

import com.nazmul.domain.model.Blog

interface GetBlogsRepository {

    suspend fun getBlogs():List<Blog>

}