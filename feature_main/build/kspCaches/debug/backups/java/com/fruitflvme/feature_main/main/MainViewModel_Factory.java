package com.fruitflvme.feature_main.main;

import com.fruitflvme.domain.usecase.AddFavoriteCourseUseCase;
import com.fruitflvme.domain.usecase.GetCoursesUseCase;
import com.fruitflvme.domain.usecase.IsCourseLikedUseCase;
import com.fruitflvme.domain.usecase.ToggleLikeCourseUseCase;
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
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<IsCourseLikedUseCase> isCourseLikedUseCaseProvider;

  private final Provider<ToggleLikeCourseUseCase> toggleLikeCourseUseCaseProvider;

  private final Provider<GetCoursesUseCase> getCoursesUseCaseProvider;

  private final Provider<AddFavoriteCourseUseCase> addFavoriteCourseUseCaseProvider;

  public MainViewModel_Factory(Provider<IsCourseLikedUseCase> isCourseLikedUseCaseProvider,
      Provider<ToggleLikeCourseUseCase> toggleLikeCourseUseCaseProvider,
      Provider<GetCoursesUseCase> getCoursesUseCaseProvider,
      Provider<AddFavoriteCourseUseCase> addFavoriteCourseUseCaseProvider) {
    this.isCourseLikedUseCaseProvider = isCourseLikedUseCaseProvider;
    this.toggleLikeCourseUseCaseProvider = toggleLikeCourseUseCaseProvider;
    this.getCoursesUseCaseProvider = getCoursesUseCaseProvider;
    this.addFavoriteCourseUseCaseProvider = addFavoriteCourseUseCaseProvider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(isCourseLikedUseCaseProvider.get(), toggleLikeCourseUseCaseProvider.get(), getCoursesUseCaseProvider.get(), addFavoriteCourseUseCaseProvider.get());
  }

  public static MainViewModel_Factory create(
      Provider<IsCourseLikedUseCase> isCourseLikedUseCaseProvider,
      Provider<ToggleLikeCourseUseCase> toggleLikeCourseUseCaseProvider,
      Provider<GetCoursesUseCase> getCoursesUseCaseProvider,
      Provider<AddFavoriteCourseUseCase> addFavoriteCourseUseCaseProvider) {
    return new MainViewModel_Factory(isCourseLikedUseCaseProvider, toggleLikeCourseUseCaseProvider, getCoursesUseCaseProvider, addFavoriteCourseUseCaseProvider);
  }

  public static MainViewModel newInstance(IsCourseLikedUseCase isCourseLikedUseCase,
      ToggleLikeCourseUseCase toggleLikeCourseUseCase, GetCoursesUseCase getCoursesUseCase,
      AddFavoriteCourseUseCase addFavoriteCourseUseCase) {
    return new MainViewModel(isCourseLikedUseCase, toggleLikeCourseUseCase, getCoursesUseCase, addFavoriteCourseUseCase);
  }
}
