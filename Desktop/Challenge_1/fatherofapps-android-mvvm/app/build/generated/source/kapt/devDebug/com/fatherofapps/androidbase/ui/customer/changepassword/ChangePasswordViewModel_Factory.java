// Generated by Dagger (https://dagger.dev).
package com.fatherofapps.androidbase.ui.customer.changepassword;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChangePasswordViewModel_Factory implements Factory<ChangePasswordViewModel> {
  @Override
  public ChangePasswordViewModel get() {
    return newInstance();
  }

  public static ChangePasswordViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ChangePasswordViewModel newInstance() {
    return new ChangePasswordViewModel();
  }

  private static final class InstanceHolder {
    private static final ChangePasswordViewModel_Factory INSTANCE = new ChangePasswordViewModel_Factory();
  }
}
