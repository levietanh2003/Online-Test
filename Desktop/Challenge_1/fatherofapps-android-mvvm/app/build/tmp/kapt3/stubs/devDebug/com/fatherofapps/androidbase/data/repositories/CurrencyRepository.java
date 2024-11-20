package com.fatherofapps.androidbase.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ;\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/fatherofapps/androidbase/data/repositories/CurrencyRepository;", "", "currencyRemoteServices", "Lcom/fatherofapps/androidbase/data/services/CurrencyRemoteServices;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/fatherofapps/androidbase/data/services/CurrencyRemoteServices;Lkotlinx/coroutines/CoroutineDispatcher;)V", "fetchCurrencies", "Lcom/fatherofapps/androidbase/base/network/NetworkResult;", "Lcom/fatherofapps/androidbase/data/models/CurrencyResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "testConvert", "Lcom/fatherofapps/androidbase/data/models/ForexResponse;", "from", "", "to", "amount", "", "precision", "", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_devDebug"})
public final class CurrencyRepository {
    private final com.fatherofapps.androidbase.data.services.CurrencyRemoteServices currencyRemoteServices = null;
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher = null;
    
    @javax.inject.Inject
    public CurrencyRepository(@org.jetbrains.annotations.NotNull
    com.fatherofapps.androidbase.data.services.CurrencyRemoteServices currencyRemoteServices, @org.jetbrains.annotations.NotNull
    @com.fatherofapps.androidbase.di.IoDispatcher
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchCurrencies(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.fatherofapps.androidbase.base.network.NetworkResult<com.fatherofapps.androidbase.data.models.CurrencyResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object testConvert(@org.jetbrains.annotations.NotNull
    java.lang.String from, @org.jetbrains.annotations.NotNull
    java.lang.String to, float amount, @org.jetbrains.annotations.Nullable
    java.lang.Integer precision, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.fatherofapps.androidbase.base.network.NetworkResult<com.fatherofapps.androidbase.data.models.ForexResponse>> continuation) {
        return null;
    }
}