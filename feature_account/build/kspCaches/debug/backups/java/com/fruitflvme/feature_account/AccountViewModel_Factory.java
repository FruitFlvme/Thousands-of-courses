package com.fruitflvme.feature_account;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class AccountViewModel_Factory implements Factory<AccountViewModel> {
  @Override
  public AccountViewModel get() {
    return newInstance();
  }

  public static AccountViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AccountViewModel newInstance() {
    return new AccountViewModel();
  }

  private static final class InstanceHolder {
    static final AccountViewModel_Factory INSTANCE = new AccountViewModel_Factory();
  }
}
