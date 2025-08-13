package com.fruitflvme.`data`.database.dao

import androidx.room.EntityDeleteOrUpdateAdapter
import androidx.room.EntityInsertAdapter
import androidx.room.RoomDatabase
import androidx.room.coroutines.createFlow
import androidx.room.util.getColumnIndexOrThrow
import androidx.room.util.performSuspending
import androidx.sqlite.SQLiteStatement
import com.fruitflvme.`data`.database.entity.CourseEntity
import javax.`annotation`.processing.Generated
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.MutableList
import kotlin.collections.mutableListOf
import kotlin.reflect.KClass
import kotlinx.coroutines.flow.Flow

@Generated(value = ["androidx.room.RoomProcessor"])
@Suppress(names = ["UNCHECKED_CAST", "DEPRECATION", "REDUNDANT_PROJECTION", "REMOVAL"])
public class CourseDao_Impl(
  __db: RoomDatabase,
) : CourseDao {
  private val __db: RoomDatabase

  private val __insertAdapterOfCourseEntity: EntityInsertAdapter<CourseEntity>

  private val __deleteAdapterOfCourseEntity: EntityDeleteOrUpdateAdapter<CourseEntity>
  init {
    this.__db = __db
    this.__insertAdapterOfCourseEntity = object : EntityInsertAdapter<CourseEntity>() {
      protected override fun createQuery(): String =
          "INSERT OR IGNORE INTO `liked_courses` (`id`,`title`,`text`,`price`,`rate`,`startDate`,`hasLike`,`publishDate`) VALUES (?,?,?,?,?,?,?,?)"

      protected override fun bind(statement: SQLiteStatement, entity: CourseEntity) {
        statement.bindLong(1, entity.id.toLong())
        statement.bindText(2, entity.title)
        statement.bindText(3, entity.text)
        statement.bindText(4, entity.price)
        statement.bindText(5, entity.rate)
        statement.bindText(6, entity.startDate)
        val _tmp: Int = if (entity.hasLike) 1 else 0
        statement.bindLong(7, _tmp.toLong())
        statement.bindText(8, entity.publishDate)
      }
    }
    this.__deleteAdapterOfCourseEntity = object : EntityDeleteOrUpdateAdapter<CourseEntity>() {
      protected override fun createQuery(): String = "DELETE FROM `liked_courses` WHERE `id` = ?"

      protected override fun bind(statement: SQLiteStatement, entity: CourseEntity) {
        statement.bindLong(1, entity.id.toLong())
      }
    }
  }

  public override suspend fun likeCourse(course: CourseEntity): Unit = performSuspending(__db,
      false, true) { _connection ->
    __insertAdapterOfCourseEntity.insert(_connection, course)
  }

  public override suspend fun unlikeCourse(course: CourseEntity): Unit = performSuspending(__db,
      false, true) { _connection ->
    __deleteAdapterOfCourseEntity.handle(_connection, course)
  }

  public override fun getLikedCourseFlow(id: Int): Flow<CourseEntity?> {
    val _sql: String = "SELECT * FROM liked_courses WHERE id = ? LIMIT 1"
    return createFlow(__db, false, arrayOf("liked_courses")) { _connection ->
      val _stmt: SQLiteStatement = _connection.prepare(_sql)
      try {
        var _argIndex: Int = 1
        _stmt.bindLong(_argIndex, id.toLong())
        val _columnIndexOfId: Int = getColumnIndexOrThrow(_stmt, "id")
        val _columnIndexOfTitle: Int = getColumnIndexOrThrow(_stmt, "title")
        val _columnIndexOfText: Int = getColumnIndexOrThrow(_stmt, "text")
        val _columnIndexOfPrice: Int = getColumnIndexOrThrow(_stmt, "price")
        val _columnIndexOfRate: Int = getColumnIndexOrThrow(_stmt, "rate")
        val _columnIndexOfStartDate: Int = getColumnIndexOrThrow(_stmt, "startDate")
        val _columnIndexOfHasLike: Int = getColumnIndexOrThrow(_stmt, "hasLike")
        val _columnIndexOfPublishDate: Int = getColumnIndexOrThrow(_stmt, "publishDate")
        val _result: CourseEntity?
        if (_stmt.step()) {
          val _tmpId: Int
          _tmpId = _stmt.getLong(_columnIndexOfId).toInt()
          val _tmpTitle: String
          _tmpTitle = _stmt.getText(_columnIndexOfTitle)
          val _tmpText: String
          _tmpText = _stmt.getText(_columnIndexOfText)
          val _tmpPrice: String
          _tmpPrice = _stmt.getText(_columnIndexOfPrice)
          val _tmpRate: String
          _tmpRate = _stmt.getText(_columnIndexOfRate)
          val _tmpStartDate: String
          _tmpStartDate = _stmt.getText(_columnIndexOfStartDate)
          val _tmpHasLike: Boolean
          val _tmp: Int
          _tmp = _stmt.getLong(_columnIndexOfHasLike).toInt()
          _tmpHasLike = _tmp != 0
          val _tmpPublishDate: String
          _tmpPublishDate = _stmt.getText(_columnIndexOfPublishDate)
          _result =
              CourseEntity(_tmpId,_tmpTitle,_tmpText,_tmpPrice,_tmpRate,_tmpStartDate,_tmpHasLike,_tmpPublishDate)
        } else {
          _result = null
        }
        _result
      } finally {
        _stmt.close()
      }
    }
  }

  public override fun getCoursesLikedFlow(): Flow<List<CourseEntity>> {
    val _sql: String = "SELECT * FROM liked_courses"
    return createFlow(__db, false, arrayOf("liked_courses")) { _connection ->
      val _stmt: SQLiteStatement = _connection.prepare(_sql)
      try {
        val _columnIndexOfId: Int = getColumnIndexOrThrow(_stmt, "id")
        val _columnIndexOfTitle: Int = getColumnIndexOrThrow(_stmt, "title")
        val _columnIndexOfText: Int = getColumnIndexOrThrow(_stmt, "text")
        val _columnIndexOfPrice: Int = getColumnIndexOrThrow(_stmt, "price")
        val _columnIndexOfRate: Int = getColumnIndexOrThrow(_stmt, "rate")
        val _columnIndexOfStartDate: Int = getColumnIndexOrThrow(_stmt, "startDate")
        val _columnIndexOfHasLike: Int = getColumnIndexOrThrow(_stmt, "hasLike")
        val _columnIndexOfPublishDate: Int = getColumnIndexOrThrow(_stmt, "publishDate")
        val _result: MutableList<CourseEntity> = mutableListOf()
        while (_stmt.step()) {
          val _item: CourseEntity
          val _tmpId: Int
          _tmpId = _stmt.getLong(_columnIndexOfId).toInt()
          val _tmpTitle: String
          _tmpTitle = _stmt.getText(_columnIndexOfTitle)
          val _tmpText: String
          _tmpText = _stmt.getText(_columnIndexOfText)
          val _tmpPrice: String
          _tmpPrice = _stmt.getText(_columnIndexOfPrice)
          val _tmpRate: String
          _tmpRate = _stmt.getText(_columnIndexOfRate)
          val _tmpStartDate: String
          _tmpStartDate = _stmt.getText(_columnIndexOfStartDate)
          val _tmpHasLike: Boolean
          val _tmp: Int
          _tmp = _stmt.getLong(_columnIndexOfHasLike).toInt()
          _tmpHasLike = _tmp != 0
          val _tmpPublishDate: String
          _tmpPublishDate = _stmt.getText(_columnIndexOfPublishDate)
          _item =
              CourseEntity(_tmpId,_tmpTitle,_tmpText,_tmpPrice,_tmpRate,_tmpStartDate,_tmpHasLike,_tmpPublishDate)
          _result.add(_item)
        }
        _result
      } finally {
        _stmt.close()
      }
    }
  }

  public companion object {
    public fun getRequiredConverters(): List<KClass<*>> = emptyList()
  }
}
