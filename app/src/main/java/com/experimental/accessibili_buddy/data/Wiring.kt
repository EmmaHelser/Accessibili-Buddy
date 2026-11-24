package com.experimental.accessibili_buddy.data

import android.content.Context
import android.content.res.AssetManager
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindRepository(real: RealRepository): Repository
}

@Module
@InstallIn(SingletonComponent::class)
object AssetModule {

    @Provides
    fun provideAssetManager(@ApplicationContext context: Context): AssetManager =
        context.assets
}