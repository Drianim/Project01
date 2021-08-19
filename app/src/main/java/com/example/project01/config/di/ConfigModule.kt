package com.example.project01.config.di

import com.example.project01.config.Config
import com.example.project01.config.ConfigImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface ConfigModule {

    @Binds
    fun bindConfig(config: ConfigImpl): Config
}