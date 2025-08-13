package com.fruitflvme.thousandsofcourses.di;

import com.fruitflvme.data.network.CoursesApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import retrofit2.Retrofit;

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
public final class AppModule_ProvideCoursesApiFactory implements Factory<CoursesApi> {
  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideCoursesApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public CoursesApi get() {
    return provideCoursesApi(retrofitProvider.get());
  }

  public static AppModule_ProvideCoursesApiFactory create(Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideCoursesApiFactory(retrofitProvider);
  }

  public static CoursesApi provideCoursesApi(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideCoursesApi(retrofit));
  }
}
