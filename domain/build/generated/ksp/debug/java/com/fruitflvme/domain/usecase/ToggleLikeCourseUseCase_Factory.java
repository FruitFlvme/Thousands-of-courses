package com.fruitflvme.domain.usecase;

import com.fruitflvme.domain.repository.CourseRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class ToggleLikeCourseUseCase_Factory implements Factory<ToggleLikeCourseUseCase> {
  private final Provider<CourseRepository> repositoryProvider;

  public ToggleLikeCourseUseCase_Factory(Provider<CourseRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ToggleLikeCourseUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static ToggleLikeCourseUseCase_Factory create(
      Provider<CourseRepository> repositoryProvider) {
    return new ToggleLikeCourseUseCase_Factory(repositoryProvider);
  }

  public static ToggleLikeCourseUseCase newInstance(CourseRepository repository) {
    return new ToggleLikeCourseUseCase(repository);
  }
}
