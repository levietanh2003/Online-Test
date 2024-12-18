// Generated by Dagger (https://dagger.dev).
package com.fatherofapps.androidbase.data.repositories;

import com.fatherofapps.androidbase.data.services.CurrencyRemoteServices;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CurrencyRepository_Factory implements Factory<CurrencyRepository> {
  private final Provider<CurrencyRemoteServices> currencyRemoteServicesProvider;

  private final Provider<CoroutineDispatcher> dispatcherProvider;

  public CurrencyRepository_Factory(Provider<CurrencyRemoteServices> currencyRemoteServicesProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    this.currencyRemoteServicesProvider = currencyRemoteServicesProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public CurrencyRepository get() {
    return newInstance(currencyRemoteServicesProvider.get(), dispatcherProvider.get());
  }

  public static CurrencyRepository_Factory create(
      Provider<CurrencyRemoteServices> currencyRemoteServicesProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    return new CurrencyRepository_Factory(currencyRemoteServicesProvider, dispatcherProvider);
  }

  public static CurrencyRepository newInstance(CurrencyRemoteServices currencyRemoteServices,
      CoroutineDispatcher dispatcher) {
    return new CurrencyRepository(currencyRemoteServices, dispatcher);
  }
}
