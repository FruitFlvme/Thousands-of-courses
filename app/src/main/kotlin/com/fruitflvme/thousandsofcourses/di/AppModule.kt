package com.fruitflvme.thousandsofcourses.di

import android.content.Context
import androidx.room.Room
import com.fruitflvme.data.database.AppDatabase
import com.fruitflvme.data.database.dao.CourseDao
import com.fruitflvme.data.network.CoursesApi
import com.fruitflvme.data.network.MockInterceptor
import com.fruitflvme.data.repository.CourseRepositoryImpl
import com.fruitflvme.data.repository.CoursesApiRepositoryImpl
import com.fruitflvme.domain.repository.CourseRepository
import com.fruitflvme.domain.repository.CoursesApiRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext appContext: Context): AppDatabase =
        Room.databaseBuilder(appContext, AppDatabase::class.java, "app_database").build()

    @Provides
    fun provideCourseDao(database: AppDatabase): CourseDao = database.courseDao()

    @Provides
    fun provideCourseRepository(dao: CourseDao): CourseRepository =
        CourseRepositoryImpl(dao)

    @Provides
    @Singleton
    fun provideOkHttpClient(@ApplicationContext context: Context): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(MockInterceptor(context))
            .build()


    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit =
        Retrofit.Builder()
            .baseUrl("https://mock.api/")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()


    @Provides
    @Singleton
    fun provideCoursesApi(retrofit: Retrofit): CoursesApi =
        retrofit.create(CoursesApi::class.java)


    @Provides
    @Singleton
    fun provideCoursesRepository(api: CoursesApi): CoursesApiRepository =
        CoursesApiRepositoryImpl(api)
}