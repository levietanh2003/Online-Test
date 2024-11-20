package com.fatherofapps.androidbase.base.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004R\u001a\u0010\b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lcom/fatherofapps/androidbase/base/network/BaseNetworkException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "responseMessage", "", "responseCode", "", "(Ljava/lang/String;I)V", "mainMessage", "getMainMessage", "()Ljava/lang/String;", "setMainMessage", "(Ljava/lang/String;)V", "getResponseCode", "()I", "getResponseMessage", "parseFromString", "", "errorBody", "app_devDebug"})
public final class BaseNetworkException extends java.lang.Exception {
    @org.jetbrains.annotations.Nullable
    private final java.lang.String responseMessage = null;
    private final int responseCode = 0;
    @org.jetbrains.annotations.NotNull
    private java.lang.String mainMessage = "";
    
    public BaseNetworkException() {
        super();
    }
    
    public BaseNetworkException(@org.jetbrains.annotations.Nullable
    java.lang.String responseMessage, int responseCode) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getResponseMessage() {
        return null;
    }
    
    public final int getResponseCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMainMessage() {
        return null;
    }
    
    public final void setMainMessage(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final void parseFromString(@org.jetbrains.annotations.NotNull
    java.lang.String errorBody) {
    }
}