package com.fruitflvme.thousandsofcourses.di;

import com.fruitflvme.data.network.CoursesApi;
import com.fruitflvme.domain.repository.CoursesApiRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvideCoursesRepositoryFactory implements Factory<CoursesApiRepository> {
  private final Provider<CoursesApi> apiProvider;

  public AppModule_ProvideCoursesRepositoryFactory(Provider<CoursesApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public CoursesApiRepository get() {
    return provideCoursesRepository(apiProvider.get());
  }

  public static AppModule_ProvideCoursesRepositoryFactory create(Provider<CoursesApi> apiProvider) {
    return new AppModule_ProvideCoursesRepositoryFactory(apiProvider);
  }

  public static CoursesApiRepository provideCoursesRepository(CoursesApi api) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideCoursesRepository(api));
  }
}
