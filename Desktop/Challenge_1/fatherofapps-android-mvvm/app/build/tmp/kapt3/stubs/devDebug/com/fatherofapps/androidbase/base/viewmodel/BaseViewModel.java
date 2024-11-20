package com.fatherofapps.androidbase.base.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0006H\u0004J\u0010\u0010,\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0019H\u0004J\b\u0010-\u001a\u00020*H\u0016J\u0010\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u00020\fH\u0004J\u0010\u00100\u001a\u00020*2\u0006\u00101\u001a\u000202H\u0014J\b\u00103\u001a\u00020*H\u0004J\u0010\u00104\u001a\u00020*2\u0006\u00105\u001a\u00020\fH\u0004J\u0010\u00106\u001a\u00020*2\u0006\u00107\u001a\u00020\u0014H\u0004J\u0010\u00108\u001a\u00020*2\u0006\u00107\u001a\u00020\u0014H\u0004J\u0010\u00109\u001a\u00020*2\u0006\u00105\u001a\u00020\fH\u0004R<\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR<\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u0004@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R<\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00050\u0004@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u000bR<\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00050\u0004@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u000bR<\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00050\u0004@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\t\"\u0004\b\u001c\u0010\u000bR<\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u0004@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\t\"\u0004\b\u001f\u0010\u000bR<\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u0004@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\t\"\u0004\b\"\u0010\u000bR(\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u0003\u001a\u0004\u0018\u00010#@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(\u00a8\u0006:"}, d2 = {"Lcom/fatherofapps/androidbase/base/viewmodel/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "<set-?>", "Landroidx/lifecycle/MutableLiveData;", "Lcom/fatherofapps/androidbase/common/Event;", "Lcom/fatherofapps/androidbase/base/network/BaseNetworkException;", "baseNetworkException", "getBaseNetworkException", "()Landroidx/lifecycle/MutableLiveData;", "setBaseNetworkException", "(Landroidx/lifecycle/MutableLiveData;)V", "", "errorMessageResourceId", "getErrorMessageResourceId", "setErrorMessageResourceId", "handler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "getHandler", "()Lkotlinx/coroutines/CoroutineExceptionHandler;", "", "isLoading", "setLoading", "isLoadingMore", "setLoadingMore", "Lcom/fatherofapps/androidbase/base/network/NetworkErrorException;", "networkException", "getNetworkException", "setNetworkException", "notifyMessageResourceId", "getNotifyMessageResourceId", "setNotifyMessageResourceId", "onNavigateToPage", "getOnNavigateToPage", "setOnNavigateToPage", "Lkotlinx/coroutines/Job;", "parentJob", "getParentJob", "()Lkotlinx/coroutines/Job;", "setParentJob", "(Lkotlinx/coroutines/Job;)V", "addBaseNetworkException", "", "exception", "addNetworkException", "fetchData", "navigateToPage", "actionId", "parseErrorCallApi", "e", "", "registerJobFinish", "showError", "messageId", "showLoading", "isShow", "showLoadingMore", "showNotify", "app_devDebug"})
public class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.fatherofapps.androidbase.common.Event<com.fatherofapps.androidbase.base.network.BaseNetworkException>> baseNetworkException;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.fatherofapps.androidbase.common.Event<com.fatherofapps.androidbase.base.network.NetworkErrorException>> networkException;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.fatherofapps.androidbase.common.Event<java.lang.Boolean>> isLoading;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.fatherofapps.androidbase.common.Event<java.lang.Integer>> onNavigateToPage;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.fatherofapps.androidbase.common.Event<java.lang.Integer>> errorMessageResourceId;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.fatherofapps.androidbase.common.Event<java.lang.Integer>> notifyMessageResourceId;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.fatherofapps.androidbase.common.Event<java.lang.Boolean>> isLoadingMore;
    @org.jetbrains.annotations.Nullable
    private kotlinx.coroutines.Job parentJob;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineExceptionHandler handler = null;
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.fatherofapps.androidbase.common.Event<com.fatherofapps.androidbase.base.network.BaseNetworkException>> getBaseNetworkException() {
        return null;
    }
    
    protected final void setBaseNetworkException(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.fatherofapps.androidbase.common.Event<com.fatherofapps.androidbase.base.network.BaseNetworkException>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.fatherofapps.androidbase.common.Event<com.fatherofapps.androidbase.base.network.NetworkErrorException>> getNetworkException() {
        return null;
    }
    
    protected final void setNetworkException(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.fatherofapps.androidbase.common.Event<com.fatherofapps.androidbase.base.network.NetworkErrorException>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.fatherofapps.androidbase.common.Event<java.lang.Boolean>> isLoading() {
        return null;
    }
    
    protected final void setLoading(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.fatherofapps.androidbase.common.Event<java.lang.Boolean>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.fatherofapps.androidbase.common.Event<java.lang.Integer>> getOnNavigateToPage() {
        return null;
    }
    
    protected final void setOnNavigateToPage(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.fatherofapps.androidbase.common.Event<java.lang.Integer>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.fatherofapps.androidbase.common.Event<java.lang.Integer>> getErrorMessageResourceId() {
        return null;
    }
    
    protected final void setErrorMessageResourceId(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.fatherofapps.androidbase.common.Event<java.lang.Integer>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.fatherofapps.androidbase.common.Event<java.lang.Integer>> getNotifyMessageResourceId() {
        return null;
    }
    
    protected final void setNotifyMessageResourceId(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.fatherofapps.androidbase.common.Event<java.lang.Integer>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.fatherofapps.androidbase.common.Event<java.lang.Boolean>> isLoadingMore() {
        return null;
    }
    
    protected final void setLoadingMore(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.fatherofapps.androidbase.common.Event<java.lang.Boolean>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.Job getParentJob() {
        return null;
    }
    
    protected final void setParentJob(@org.jetbrains.annotations.Nullable
    kotlinx.coroutines.Job p0) {
    }
    
    protected final void registerJobFinish() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.CoroutineExceptionHandler getHandler() {
        return null;
    }
    
    protected final void showError(int messageId) {
    }
    
    protected final void showNotify(int messageId) {
    }
    
    protected final void addBaseNetworkException(@org.jetbrains.annotations.NotNull
    com.fatherofapps.androidbase.base.network.BaseNetworkException exception) {
    }
    
    protected final void addNetworkException(@org.jetbrains.annotations.NotNull
    com.fatherofapps.androidbase.base.network.NetworkErrorException exception) {
    }
    
    protected final void showLoading(boolean isShow) {
    }
    
    protected final void showLoadingMore(boolean isShow) {
    }
    
    protected final void navigateToPage(int actionId) {
    }
    
    protected void parseErrorCallApi(@org.jetbrains.annotations.NotNull
    java.lang.Throwable e) {
    }
    
    public void fetchData() {
    }
}