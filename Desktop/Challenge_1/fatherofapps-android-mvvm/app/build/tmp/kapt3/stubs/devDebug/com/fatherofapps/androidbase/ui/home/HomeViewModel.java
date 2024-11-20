package com.fatherofapps.androidbase.ui.home;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J/\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0002\u0010\u0017R&\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/fatherofapps/androidbase/ui/home/HomeViewModel;", "Lcom/fatherofapps/androidbase/base/viewmodel/BaseViewModel;", "currencyRepository", "Lcom/fatherofapps/androidbase/data/repositories/CurrencyRepository;", "(Lcom/fatherofapps/androidbase/data/repositories/CurrencyRepository;)V", "_resultConvert", "Landroidx/lifecycle/MutableLiveData;", "Lcom/fatherofapps/androidbase/base/network/NetworkResult;", "", "", "", "resultConvert", "Landroidx/lifecycle/LiveData;", "getResultConvert", "()Landroidx/lifecycle/LiveData;", "fetchResultConvert", "", "from", "to", "amount", "", "precision", "", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/Integer;)V", "app_devDebug"})
public final class HomeViewModel extends com.fatherofapps.androidbase.base.viewmodel.BaseViewModel {
    private final com.fatherofapps.androidbase.data.repositories.CurrencyRepository currencyRepository = null;
    private final androidx.lifecycle.MutableLiveData<com.fatherofapps.androidbase.base.network.NetworkResult<java.util.Map<java.lang.String, java.lang.Double>>> _resultConvert = null;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    com.fatherofapps.androidbase.data.repositories.CurrencyRepository currencyRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.fatherofapps.androidbase.base.network.NetworkResult<java.util.Map<java.lang.String, java.lang.Double>>> getResultConvert() {
        return null;
    }
    
    public final void fetchResultConvert(@org.jetbrains.annotations.NotNull
    java.lang.String from, @org.jetbrains.annotations.NotNull
    java.lang.String to, float amount, @org.jetbrains.annotations.Nullable
    java.lang.Integer precision) {
    }
}