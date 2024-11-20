package com.fatherofapps.androidbase.base.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0004J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0004J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0004J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0004J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0004J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0004J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0004J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0004J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\bH\u0004J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0004H\u0004J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aH\u0004J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aH\u0004J\u001a\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0004J\u001a\u0010\u001c\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0004\u00a8\u0006\u001f"}, d2 = {"Lcom/fatherofapps/androidbase/base/fragment/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "getDefaultNotifyTitle", "", "navigateToPage", "", "actionId", "", "registerAllExceptionEvent", "viewModel", "Lcom/fatherofapps/androidbase/base/viewmodel/BaseViewModel;", "viewLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "registerObserverExceptionEvent", "registerObserverLoadingEvent", "registerObserverLoadingMoreEvent", "registerObserverMessageEvent", "registerObserverNetworkExceptionEvent", "showErrorMessage", "e", "Lcom/fatherofapps/androidbase/base/network/BaseNetworkException;", "messageId", "message", "showLoading", "isShow", "", "showLoadingMore", "showNotify", "titleId", "title", "app_devDebug"})
public class BaseFragment extends androidx.fragment.app.Fragment {
    
    public BaseFragment() {
        super();
    }
    
    protected final void navigateToPage(int actionId) {
    }
    
    protected final void showLoading(boolean isShow) {
    }
    
    protected final void showErrorMessage(@org.jetbrains.annotations.NotNull
    com.fatherofapps.androidbase.base.network.BaseNetworkException e) {
    }
    
    protected final void showErrorMessage(int messageId) {
    }
    
    protected final void showErrorMessage(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    protected final void showNotify(@org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    protected final void showNotify(int titleId, int messageId) {
    }
    
    protected final void registerObserverExceptionEvent(@org.jetbrains.annotations.NotNull
    com.fatherofapps.androidbase.base.viewmodel.BaseViewModel viewModel, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner viewLifecycleOwner) {
    }
    
    protected final void registerObserverNetworkExceptionEvent(@org.jetbrains.annotations.NotNull
    com.fatherofapps.androidbase.base.viewmodel.BaseViewModel viewModel, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner viewLifecycleOwner) {
    }
    
    protected final void registerObserverMessageEvent(@org.jetbrains.annotations.NotNull
    com.fatherofapps.androidbase.base.viewmodel.BaseViewModel viewModel, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner viewLifecycleOwner) {
    }
    
    protected final void registerObserverLoadingMoreEvent(@org.jetbrains.annotations.NotNull
    com.fatherofapps.androidbase.base.viewmodel.BaseViewModel viewModel, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner viewLifecycleOwner) {
    }
    
    protected final void showLoadingMore(boolean isShow) {
    }
    
    private final java.lang.String getDefaultNotifyTitle() {
        return null;
    }
    
    protected final void registerAllExceptionEvent(@org.jetbrains.annotations.NotNull
    com.fatherofapps.androidbase.base.viewmodel.BaseViewModel viewModel, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner viewLifecycleOwner) {
    }
    
    protected final void registerObserverLoadingEvent(@org.jetbrains.annotations.NotNull
    com.fatherofapps.androidbase.base.viewmodel.BaseViewModel viewModel, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner viewLifecycleOwner) {
    }
}