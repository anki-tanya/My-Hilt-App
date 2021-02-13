package com.example.recyclerview.myhiltapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Singleton
    @Provides
    @Named("Str1")
    fun ProvidesRandomString1() = "Hey! I am providing a random string part one"

    @Singleton
    @Provides
    @Named("Str2")
    fun ProvidesRandomString2() = "Hey! I am providing a random string part two"

}