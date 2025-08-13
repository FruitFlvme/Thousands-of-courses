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
public final class GetCoursesUseCase_Factory implements Factory<GetCoursesUseCase> {
  private final Provider<CoursesApiRepository> repositoryProvider;

  public GetCoursesUseCase_Factory(Provider<CoursesApiRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetCoursesUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetCoursesUseCase_Factory create(
      Provider<CoursesApiRepository> repositoryProvider) {
    return new GetCoursesUseCase_Factory(repositoryProvider);
  }

  public static GetCoursesUseCase newInstance(CoursesApiRepository repository) {
    return new GetCoursesUseCase(repository);
  }
}
