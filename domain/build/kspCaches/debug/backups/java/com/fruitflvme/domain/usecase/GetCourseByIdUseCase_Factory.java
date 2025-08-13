package com.fruitflvme.domain.usecase;

import com.fruitflvme.domain.repository.CoursesApiRepository;
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
public final class GetCourseByIdUseCase_Factory implements Factory<GetCourseByIdUseCase> {
  private final Provider<CoursesApiRepository> repositoryProvider;

  public GetCourseByIdUseCase_Factory(Provider<CoursesApiRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetCourseByIdUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetCourseByIdUseCase_Factory create(
      Provider<CoursesApiRepository> repositoryProvider) {
    return new GetCourseByIdUseCase_Factory(repositoryProvider);
  }

  public static GetCourseByIdUseCase newInstance(CoursesApiRepository repository) {
    return new GetCourseByIdUseCase(repository);
  }
}
