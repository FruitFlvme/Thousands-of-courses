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
public final class AddFavoriteCourseUseCase_Factory implements Factory<AddFavoriteCourseUseCase> {
  private final Provider<CourseRepository> repositoryProvider;

  public AddFavoriteCourseUseCase_Factory(Provider<CourseRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public AddFavoriteCourseUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static AddFavoriteCourseUseCase_Factory create(
      Provider<CourseRepository> repositoryProvider) {
    return new AddFavoriteCourseUseCase_Factory(repositoryProvider);
  }

  public static AddFavoriteCourseUseCase newInstance(CourseRepository repository) {
    return new AddFavoriteCourseUseCase(repository);
  }
}
