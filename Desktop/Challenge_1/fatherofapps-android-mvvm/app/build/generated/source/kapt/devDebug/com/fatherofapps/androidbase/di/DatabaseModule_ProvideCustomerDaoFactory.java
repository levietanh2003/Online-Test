// Generated by Dagger (https://dagger.dev).
package com.fatherofapps.androidbase.di;

import com.fatherofapps.androidbase.data.database.AppDatabase;
import com.fatherofapps.androidbase.data.database.daos.CustomerDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideCustomerDaoFactory implements Factory<CustomerDao> {
  private final DatabaseModule module;

  private final Provider<AppDatabase> appDatabaseProvider;

  public DatabaseModule_ProvideCustomerDaoFactory(DatabaseModule module,
      Provider<AppDatabase> appDatabaseProvider) {
    this.module = module;
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public CustomerDao get() {
    return provideCustomerDao(module, appDatabaseProvider.get());
  }

  public static DatabaseModule_ProvideCustomerDaoFactory create(DatabaseModule module,
      Provider<AppDatabase> appDatabaseProvider) {
    return new DatabaseModule_ProvideCustomerDaoFactory(module, appDatabaseProvider);
  }

  public static CustomerDao provideCustomerDao(DatabaseModule instance, AppDatabase appDatabase) {
    return Preconditions.checkNotNullFromProvides(instance.provideCustomerDao(appDatabase));
  }
}
