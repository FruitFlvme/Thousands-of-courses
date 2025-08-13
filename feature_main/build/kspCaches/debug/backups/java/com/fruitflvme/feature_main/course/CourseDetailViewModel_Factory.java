package com.fruitflvme.feature_main.course;

import androidx.lifecycle.SavedStateHandle;
import com.fruitflvme.domain.usecase.GetCourseByIdUseCase;
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
public final class CourseDetailViewModel_Factory implements Factory<CourseDetailViewModel> {
  private final Provider<IsCourseLikedUseCase> isCourseLikedUseCaseProvider;

  private final Provider<ToggleLikeCourseUseCase> toggleLikeCourseUseCaseProvider;

  private final Provider<GetCourseByIdUseCase> getCourseByIdUseCaseProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public CourseDetailViewModel_Factory(Provider<IsCourseLikedUseCase> isCourseLikedUseCaseProvider,
      Provider<ToggleLikeCourseUseCase> toggleLikeCourseUseCaseProvider,
      Provider<GetCourseByIdUseCase> getCourseByIdUseCaseProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.isCourseLikedUseCaseProvider = isCourseLikedUseCaseProvider;
    this.toggleLikeCourseUseCaseProvider = toggleLikeCourseUseCaseProvider;
    this.getCourseByIdUseCaseProvider = getCourseByIdUseCaseProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public CourseDetailViewModel get() {
    return newInstance(isCourseLikedUseCaseProvider.get(), toggleLikeCourseUseCaseProvider.get(), getCourseByIdUseCaseProvider.get(), savedStateHandleProvider.get());
  }

  public static CourseDetailViewModel_Factory create(
      Provider<IsCourseLikedUseCase> isCourseLikedUseCaseProvider,
      Provider<ToggleLikeCourseUseCase> toggleLikeCourseUseCaseProvider,
      Provider<GetCourseByIdUseCase> getCourseByIdUseCaseProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new CourseDetailViewModel_Factory(isCourseLikedUseCaseProvider, toggleLikeCourseUseCaseProvider, getCourseByIdUseCaseProvider, savedStateHandleProvider);
  }

  public static CourseDetailViewModel newInstance(IsCourseLikedUseCase isCourseLikedUseCase,
      ToggleLikeCourseUseCase toggleLikeCourseUseCase, GetCourseByIdUseCase getCourseByIdUseCase,
      SavedStateHandle savedStateHandle) {
    return new CourseDetailViewModel(isCourseLikedUseCase, toggleLikeCourseUseCase, getCourseByIdUseCase, savedStateHandle);
  }
}
