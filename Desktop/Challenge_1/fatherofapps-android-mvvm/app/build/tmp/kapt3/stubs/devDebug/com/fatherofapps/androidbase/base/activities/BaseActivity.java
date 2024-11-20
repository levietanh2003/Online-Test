package com.fatherofapps.androidbase.base.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016J<\u0010\u0003\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\"\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006H\u0016J$\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0016\u00a8\u0006\u0018"}, d2 = {"Lcom/fatherofapps/androidbase/base/activities/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "showConfirmDialog", "", "titleResourceId", "", "messageResourceId", "positiveTitleResourceId", "negativeTitleResourceId", "textButtonResourceId", "callback", "Lcom/fatherofapps/androidbase/base/dialogs/ConfirmDialog$ConfirmCallback;", "title", "", "message", "positiveButtonTitle", "negativeButtonTitle", "textButton", "showErrorDialog", "showLoading", "isShow", "", "showNotifyDialog", "app_devDebug"})
public class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    
    public BaseActivity() {
        super();
    }
    
    public void showLoading(boolean isShow) {
    }
    
    public void showErrorDialog(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    public void showNotifyDialog(int titleResourceId, int messageResourceId, int textButtonResourceId) {
    }
    
    public void showNotifyDialog(@org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.String textButton) {
    }
    
    public void showConfirmDialog(int titleResourceId, int messageResourceId, int positiveTitleResourceId, int negativeTitleResourceId, int textButtonResourceId, @org.jetbrains.annotations.NotNull
    com.fatherofapps.androidbase.base.dialogs.ConfirmDialog.ConfirmCallback callback) {
    }
    
    public void showConfirmDialog(@org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.String message, @org.jetbrains.annotations.NotNull
    java.lang.String positiveButtonTitle, @org.jetbrains.annotations.NotNull
    java.lang.String negativeButtonTitle, @org.jetbrains.annotations.Nullable
    java.lang.String textButton, @org.jetbrains.annotations.NotNull
    com.fatherofapps.androidbase.base.dialogs.ConfirmDialog.ConfirmCallback callback) {
    }
}