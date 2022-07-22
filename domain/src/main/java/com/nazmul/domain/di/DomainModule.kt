package com.nazmul.domain.di

import com.nazmul.domain.repository.GetBlogsRepository
import com.nazmul.domain.use_case.GetBlogsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DomainModule {



    @Provides
    fun provideGetBlogsUseCase(getBlogsRepository: GetBlogsRepository): GetBlogsUseCase {
        return GetBlogsUseCase(getBlogsRepository)
    }

}