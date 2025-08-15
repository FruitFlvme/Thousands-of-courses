package com.fruitflvme.thousandsofcourses.di

import android.content.Context
import androidx.room.Room
import com.fruitflvme.data.database.AppDatabase
import com.fruitflvme.data.database.dao.CourseDao
import com.fruitflvme.data.repository.CourseRepositoryImpl
import com.fruitflvme.domain.repository.CourseRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
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
}
