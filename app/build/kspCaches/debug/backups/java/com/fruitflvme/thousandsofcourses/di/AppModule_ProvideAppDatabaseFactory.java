package com.fruitflvme.thousandsofcourses.di;

import android.content.Context;
import com.fruitflvme.data.database.AppDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class AppModule_ProvideAppDatabaseFactory implements Factory<AppDatabase> {
  private final Provider<Context> appContextProvider;

  public AppModule_ProvideAppDatabaseFactory(Provider<Context> appContextProvider) {
    this.appContextProvider = appContextProvider;
  }

  @Override
  public AppDatabase get() {
    return provideAppDatabase(appContextProvider.get());
  }

  public static AppModule_ProvideAppDatabaseFactory create(Provider<Context> appContextProvider) {
    return new AppModule_ProvideAppDatabaseFactory(appContextProvider);
  }

  public static AppDatabase provideAppDatabase(Context appContext) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideAppDatabase(appContext));
  }
}
