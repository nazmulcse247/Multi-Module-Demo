package com.nazmul.data.mappers

import com.nazmul.data.network.model.BlogDTO
import com.nazmul.data.network.model.OwnerDTO
import com.nazmul.domain.model.Blog
import java.security.acl.Owner

fun List<BlogDTO>.toDomain(): List<Blog> {

    return map {
        Blog(
            id = it.id ?: "",
            image = it.image ?: "",
            likes = it.likes ?: 0,
            owner = it.owner?.toDomain() ?: Owner("", "", "", "", ""),
            publishDate = it.publishDate ?: "",
            tags = it.tags ?: emptyList(),
            text = it.text ?: ""

        )
    }

}


fun OwnerDTO.toDomain(): Owner {
    return Owner(
        firstName = firstName ?: "",
        id = id ?: "",
        lastName = lastName ?: "",
        picture = picture ?: "",
        title = title ?: ""
    )
}