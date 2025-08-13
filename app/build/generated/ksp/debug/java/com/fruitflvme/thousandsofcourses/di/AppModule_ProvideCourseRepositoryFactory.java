package com.fruitflvme.thousandsofcourses.di;

import com.fruitflvme.data.database.dao.CourseDao;
import com.fruitflvme.domain.repository.CourseRepository;
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
public final class AppModule_ProvideCourseRepositoryFactory implements Factory<CourseRepository> {
  private final Provider<CourseDao> daoProvider;

  public AppModule_ProvideCourseRepositoryFactory(Provider<CourseDao> daoProvider) {
    this.daoProvider = daoProvider;
  }

  @Override
  public CourseRepository get() {
    return provideCourseRepository(daoProvider.get());
  }

  public static AppModule_ProvideCourseRepositoryFactory create(Provider<CourseDao> daoProvider) {
    return new AppModule_ProvideCourseRepositoryFactory(daoProvider);
  }

  public static CourseRepository provideCourseRepository(CourseDao dao) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideCourseRepository(dao));
  }
}
