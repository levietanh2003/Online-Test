package com.fatherofapps.androidbase.base.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/fatherofapps/androidbase/base/dialogs/ConfirmDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "callback", "Lcom/fatherofapps/androidbase/base/dialogs/ConfirmDialog$ConfirmCallback;", "title", "", "message", "positiveButtonTitle", "negativeButtonTitle", "(Landroid/content/Context;Lcom/fatherofapps/androidbase/base/dialogs/ConfirmDialog$ConfirmCallback;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ConfirmCallback", "app_devDebug"})
public final class ConfirmDialog extends android.app.Dialog {
    private final com.fatherofapps.androidbase.base.dialogs.ConfirmDialog.ConfirmCallback callback = null;
    private final java.lang.String title = null;
    private final java.lang.String message = null;
    private final java.lang.String positiveButtonTitle = null;
    private final java.lang.String negativeButtonTitle = null;
    
    public ConfirmDialog(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    com.fatherofapps.androidbase.base.dialogs.ConfirmDialog.ConfirmCallback callback, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.String message, @org.jetbrains.annotations.NotNull
    java.lang.String positiveButtonTitle, @org.jetbrains.annotations.NotNull
    java.lang.String negativeButtonTitle) {
        super(null);
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/fatherofapps/androidbase/base/dialogs/ConfirmDialog$ConfirmCallback;", "", "negativeAction", "", "positiveAction", "app_devDebug"})
    public static abstract interface ConfirmCallback {
        
        public abstract void negativeAction();
        
        public abstract void positiveAction();
    }
}