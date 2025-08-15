package com.fruitflvme.thousandofcources.di

import com.fruitflvme.data.network.CoursesApi
import com.fruitflvme.data.repository.CoursesApiRepositoryImpl
import com.fruitflvme.domain.repository.CoursesApiRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.mockwebserver.MockWebServer
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DebugMockNetworkModule {

    @Provides
    @Singleton
    fun provideMockWebServer(): MockWebServer = MockWebServer()

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient =
        OkHttpClient.Builder().build()

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        val baseUrl = "http://localhost:8080/"

        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideCoursesApi(retrofit: Retrofit): CoursesApi =
        retrofit.create(CoursesApi::class.java)

    @Provides
    @Singleton
    fun provideCoursesRepository(api: CoursesApi): CoursesApiRepository =
        CoursesApiRepositoryImpl(api)
}



