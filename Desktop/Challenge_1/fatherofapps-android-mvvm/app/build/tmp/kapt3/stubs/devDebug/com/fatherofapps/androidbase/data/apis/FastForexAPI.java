package com.fatherofapps.androidbase.data.apis;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005JA\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/fatherofapps/androidbase/data/apis/FastForexAPI;", "", "getCurrencies", "Lretrofit2/Response;", "Lcom/fatherofapps/androidbase/data/models/CurrencyResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getExchangeRate", "Lcom/fatherofapps/androidbase/data/models/ForexResponse;", "from", "", "to", "amount", "", "precision", "", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_devDebug"})
public abstract interface FastForexAPI {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "currencies")
    public abstract java.lang.Object getCurrencies(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.fatherofapps.androidbase.data.models.CurrencyResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "convert")
    public abstract java.lang.Object getExchangeRate(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "from")
    java.lang.String from, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "to")
    java.lang.String to, @retrofit2.http.Query(value = "amount")
    float amount, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "precision")
    java.lang.Integer precision, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.fatherofapps.androidbase.data.models.ForexResponse>> continuation);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
}