package com.fruitflvme.`data`.database

import androidx.room.InvalidationTracker
import androidx.room.RoomOpenDelegate
import androidx.room.migration.AutoMigrationSpec
import androidx.room.migration.Migration
import androidx.room.util.TableInfo
import androidx.room.util.TableInfo.Companion.read
import androidx.room.util.dropFtsSyncTriggers
import androidx.sqlite.SQLiteConnection
import androidx.sqlite.execSQL
import com.fruitflvme.`data`.database.dao.CourseDao
import com.fruitflvme.`data`.database.dao.CourseDao_Impl
import javax.`annotation`.processing.Generated
import kotlin.Lazy
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.MutableList
import kotlin.collections.MutableMap
import kotlin.collections.MutableSet
import kotlin.collections.Set
import kotlin.collections.mutableListOf
import kotlin.collections.mutableMapOf
import kotlin.collections.mutableSetOf
import kotlin.reflect.KClass

@Generated(value = ["androidx.room.RoomProcessor"])
@Suppress(names = ["UNCHECKED_CAST", "DEPRECATION", "REDUNDANT_PROJECTION", "REMOVAL"])
public class AppDatabase_Impl : AppDatabase() {
  private val _courseDao: Lazy<CourseDao> = lazy {
    CourseDao_Impl(this)
  }

  protected override fun createOpenDelegate(): RoomOpenDelegate {
    val _openDelegate: RoomOpenDelegate = object : RoomOpenDelegate(1,
        "29565faf0f6364979d596b0fb672292c", "792c458a9b97f4ed3c9e518b2b222dd3") {
      public override fun createAllTables(connection: SQLiteConnection) {
        connection.execSQL("CREATE TABLE IF NOT EXISTS `liked_courses` (`id` INTEGER NOT NULL, `title` TEXT NOT NULL, `text` TEXT NOT NULL, `price` TEXT NOT NULL, `rate` TEXT NOT NULL, `startDate` TEXT NOT NULL, `hasLike` INTEGER NOT NULL, `publishDate` TEXT NOT NULL, PRIMARY KEY(`id`))")
        connection.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)")
        connection.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '29565faf0f6364979d596b0fb672292c')")
      }

      public override fun dropAllTables(connection: SQLiteConnection) {
        connection.execSQL("DROP TABLE IF EXISTS `liked_courses`")
      }

      public override fun onCreate(connection: SQLiteConnection) {
      }

      public override fun onOpen(connection: SQLiteConnection) {
        internalInitInvalidationTracker(connection)
      }

      public override fun onPreMigrate(connection: SQLiteConnection) {
        dropFtsSyncTriggers(connection)
      }

      public override fun onPostMigrate(connection: SQLiteConnection) {
      }

      public override fun onValidateSchema(connection: SQLiteConnection):
          RoomOpenDelegate.ValidationResult {
        val _columnsLikedCourses: MutableMap<String, TableInfo.Column> = mutableMapOf()
        _columnsLikedCourses.put("id", TableInfo.Column("id", "INTEGER", true, 1, null,
            TableInfo.CREATED_FROM_ENTITY))
        _columnsLikedCourses.put("title", TableInfo.Column("title", "TEXT", true, 0, null,
            TableInfo.CREATED_FROM_ENTITY))
        _columnsLikedCourses.put("text", TableInfo.Column("text", "TEXT", true, 0, null,
            TableInfo.CREATED_FROM_ENTITY))
        _columnsLikedCourses.put("price", TableInfo.Column("price", "TEXT", true, 0, null,
            TableInfo.CREATED_FROM_ENTITY))
        _columnsLikedCourses.put("rate", TableInfo.Column("rate", "TEXT", true, 0, null,
            TableInfo.CREATED_FROM_ENTITY))
        _columnsLikedCourses.put("startDate", TableInfo.Column("startDate", "TEXT", true, 0, null,
            TableInfo.CREATED_FROM_ENTITY))
        _columnsLikedCourses.put("hasLike", TableInfo.Column("hasLike", "INTEGER", true, 0, null,
            TableInfo.CREATED_FROM_ENTITY))
        _columnsLikedCourses.put("publishDate", TableInfo.Column("publishDate", "TEXT", true, 0,
            null, TableInfo.CREATED_FROM_ENTITY))
        val _foreignKeysLikedCourses: MutableSet<TableInfo.ForeignKey> = mutableSetOf()
        val _indicesLikedCourses: MutableSet<TableInfo.Index> = mutableSetOf()
        val _infoLikedCourses: TableInfo = TableInfo("liked_courses", _columnsLikedCourses,
            _foreignKeysLikedCourses, _indicesLikedCourses)
        val _existingLikedCourses: TableInfo = read(connection, "liked_courses")
        if (!_infoLikedCourses.equals(_existingLikedCourses)) {
          return RoomOpenDelegate.ValidationResult(false, """
              |liked_courses(com.fruitflvme.data.database.entity.CourseEntity).
              | Expected:
              |""".trimMargin() + _infoLikedCourses + """
              |
              | Found:
              |""".trimMargin() + _existingLikedCourses)
        }
        return RoomOpenDelegate.ValidationResult(true, null)
      }
    }
    return _openDelegate
  }

  protected override fun createInvalidationTracker(): InvalidationTracker {
    val _shadowTablesMap: MutableMap<String, String> = mutableMapOf()
    val _viewTables: MutableMap<String, Set<String>> = mutableMapOf()
    return InvalidationTracker(this, _shadowTablesMap, _viewTables, "liked_courses")
  }

  public override fun clearAllTables() {
    super.performClear(false, "liked_courses")
  }

  protected override fun getRequiredTypeConverterClasses(): Map<KClass<*>, List<KClass<*>>> {
    val _typeConvertersMap: MutableMap<KClass<*>, List<KClass<*>>> = mutableMapOf()
    _typeConvertersMap.put(CourseDao::class, CourseDao_Impl.getRequiredConverters())
    return _typeConvertersMap
  }

  public override fun getRequiredAutoMigrationSpecClasses(): Set<KClass<out AutoMigrationSpec>> {
    val _autoMigrationSpecsSet: MutableSet<KClass<out AutoMigrationSpec>> = mutableSetOf()
    return _autoMigrationSpecsSet
  }

  public override
      fun createAutoMigrations(autoMigrationSpecs: Map<KClass<out AutoMigrationSpec>, AutoMigrationSpec>):
      List<Migration> {
    val _autoMigrations: MutableList<Migration> = mutableListOf()
    return _autoMigrations
  }

  public override fun courseDao(): CourseDao = _courseDao.value
}
