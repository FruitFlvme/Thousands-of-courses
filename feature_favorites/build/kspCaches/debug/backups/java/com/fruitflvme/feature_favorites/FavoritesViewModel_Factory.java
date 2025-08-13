package com.fruitflvme.feature_favorites;

import com.fruitflvme.domain.usecase.GetCoursesLikedUseCase;
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
public final class FavoritesViewModel_Factory implements Factory<FavoritesViewModel> {
  private final Provider<GetCoursesLikedUseCase> getCoursesLikedUseCaseProvider;

  private final Provider<ToggleLikeCourseUseCase> toggleLikeCourseUseCaseProvider;

  public FavoritesViewModel_Factory(Provider<GetCoursesLikedUseCase> getCoursesLikedUseCaseProvider,
      Provider<ToggleLikeCourseUseCase> toggleLikeCourseUseCaseProvider) {
    this.getCoursesLikedUseCaseProvider = getCoursesLikedUseCaseProvider;
    this.toggleLikeCourseUseCaseProvider = toggleLikeCourseUseCaseProvider;
  }

  @Override
  public FavoritesViewModel get() {
    return newInstance(getCoursesLikedUseCaseProvider.get(), toggleLikeCourseUseCaseProvider.get());
  }

  public static FavoritesViewModel_Factory create(
      Provider<GetCoursesLikedUseCase> getCoursesLikedUseCaseProvider,
      Provider<ToggleLikeCourseUseCase> toggleLikeCourseUseCaseProvider) {
    return new FavoritesViewModel_Factory(getCoursesLikedUseCaseProvider, toggleLikeCourseUseCaseProvider);
  }

  public static FavoritesViewModel newInstance(GetCoursesLikedUseCase getCoursesLikedUseCase,
      ToggleLikeCourseUseCase toggleLikeCourseUseCase) {
    return new FavoritesViewModel(getCoursesLikedUseCase, toggleLikeCourseUseCase);
  }
}
