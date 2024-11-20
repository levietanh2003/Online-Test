package com.fatherofapps.androidbase.base.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0004\u00a8\u0006\u000e"}, d2 = {"Lcom/fatherofapps/androidbase/base/network/BaseService;", "", "()V", "parseError", "Lcom/fatherofapps/androidbase/base/network/BaseNetworkException;", "responseMessage", "", "responseCode", "", "errorBody", "parseNetworkErrorException", "Lcom/fatherofapps/androidbase/base/network/NetworkErrorException;", "throwable", "", "app_devDebug"})
public abstract class BaseService {
    
    public BaseService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    protected final com.fatherofapps.androidbase.base.network.BaseNetworkException parseError(@org.jetbrains.annotations.Nullable
    java.lang.String responseMessage, int responseCode, @org.jetbrains.annotations.Nullable
    java.lang.String errorBody) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final com.fatherofapps.androidbase.base.network.NetworkErrorException parseNetworkErrorException(@org.jetbrains.annotations.NotNull
    java.lang.Throwable throwable) {
        return null;
    }
}