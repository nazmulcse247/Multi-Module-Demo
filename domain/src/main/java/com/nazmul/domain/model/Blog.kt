package com.nazmul.domain.model

import java.security.acl.Owner

data class Blog(
    val id: String,
    val image: String,
    val likes: Int,
    val owner: Owner,
    val publishDate: String,
    val tags: List<String>,
    val text: String
)
