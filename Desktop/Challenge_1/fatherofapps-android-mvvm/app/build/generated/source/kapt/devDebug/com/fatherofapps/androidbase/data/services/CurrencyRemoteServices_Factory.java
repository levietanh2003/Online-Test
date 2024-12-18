// Generated by Dagger (https://dagger.dev).
package com.fatherofapps.androidbase.data.services;

import com.fatherofapps.androidbase.data.apis.FastForexAPI;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CurrencyRemoteServices_Factory implements Factory<CurrencyRemoteServices> {
  private final Provider<FastForexAPI> fastForexAPIProvider;

  private final Provider<CoroutineDispatcher> dispatcherProvider;

  public CurrencyRemoteServices_Factory(Provider<FastForexAPI> fastForexAPIProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    this.fastForexAPIProvider = fastForexAPIProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public CurrencyRemoteServices get() {
    return newInstance(fastForexAPIProvider.get(), dispatcherProvider.get());
  }

  public static CurrencyRemoteServices_Factory create(Provider<FastForexAPI> fastForexAPIProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    return new CurrencyRemoteServices_Factory(fastForexAPIProvider, dispatcherProvider);
  }

  public static CurrencyRemoteServices newInstance(FastForexAPI fastForexAPI,
      CoroutineDispatcher dispatcher) {
    return new CurrencyRemoteServices(fastForexAPI, dispatcher);
  }
}
