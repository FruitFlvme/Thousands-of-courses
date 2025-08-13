package com.fruitflvme.thousandsofcourses.di;

import com.fruitflvme.data.database.AppDatabase;
import com.fruitflvme.data.database.dao.CourseDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class AppModule_ProvideCourseDaoFactory implements Factory<CourseDao> {
  private final Provider<AppDatabase> databaseProvider;

  public AppModule_ProvideCourseDaoFactory(Provider<AppDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public CourseDao get() {
    return provideCourseDao(databaseProvider.get());
  }

  public static AppModule_ProvideCourseDaoFactory create(Provider<AppDatabase> databaseProvider) {
    return new AppModule_ProvideCourseDaoFactory(databaseProvider);
  }

  public static CourseDao provideCourseDao(AppDatabase database) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideCourseDao(database));
  }
}
