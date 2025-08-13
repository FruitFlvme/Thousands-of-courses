package com.fruitflvme.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.fruitflvme.data.database.dao.CourseDao
import com.fruitflvme.data.database.entity.CourseEntity

@Database(entities = [CourseEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun courseDao(): CourseDao
}