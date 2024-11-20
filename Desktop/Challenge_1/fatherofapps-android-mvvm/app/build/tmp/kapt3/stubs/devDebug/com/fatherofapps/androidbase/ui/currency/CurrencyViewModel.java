package com.fatherofapps.androidbase.ui.currency;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/fatherofapps/androidbase/ui/currency/CurrencyViewModel;", "Lcom/fatherofapps/androidbase/base/viewmodel/BaseViewModel;", "currencyRepository", "Lcom/fatherofapps/androidbase/data/repositories/CurrencyRepository;", "(Lcom/fatherofapps/androidbase/data/repositories/CurrencyRepository;)V", "_currencies", "Landroidx/lifecycle/MutableLiveData;", "", "", "currencies", "Landroidx/lifecycle/LiveData;", "getCurrencies", "()Landroidx/lifecycle/LiveData;", "fetchData", "", "app_devDebug"})
public final class CurrencyViewModel extends com.fatherofapps.androidbase.base.viewmodel.BaseViewModel {
    private final com.fatherofapps.androidbase.data.repositories.CurrencyRepository currencyRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.lang.String>> _currencies = null;
    
    @javax.inject.Inject
    public CurrencyViewModel(@org.jetbrains.annotations.NotNull
    com.fatherofapps.androidbase.data.repositories.CurrencyRepository currencyRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.Map<java.lang.String, java.lang.String>> getCurrencies() {
        return null;
    }
    
    @java.lang.Override
    public void fetchData() {
    }
}