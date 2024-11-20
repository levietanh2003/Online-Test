package com.fatherofapps.androidbase.data.apis;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J=\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bH\'\u00a2\u0006\u0002\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/fatherofapps/androidbase/data/apis/ConvertAPI;", "", "getExchangeRate", "Lretrofit2/Response;", "Lcom/fatherofapps/androidbase/data/models/ForexResponse;", "from", "", "to", "amount", "", "precision", "", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/Integer;)Lretrofit2/Response;", "app_devDebug"})
public abstract interface ConvertAPI {
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "convert")
    public abstract retrofit2.Response<com.fatherofapps.androidbase.data.models.ForexResponse> getExchangeRate(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "from")
    java.lang.String from, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "to")
    java.lang.String to, @retrofit2.http.Query(value = "amount")
    float amount, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "precision")
    java.lang.Integer precision);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
}