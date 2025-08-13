package com.fruitflvme.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.fruitflvme.data.database.entity.CourseEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface CourseDao {
    @Query("SELECT * FROM liked_courses WHERE id = :id LIMIT 1")
    fun getLikedCourseFlow(id: Int): Flow<CourseEntity?>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun likeCourse(course: CourseEntity)

    @Delete
    suspend fun unlikeCourse(course: CourseEntity)

    @Query("SELECT * FROM liked_courses")
    fun getCoursesLikedFlow(): Flow<List<CourseEntity>>
}