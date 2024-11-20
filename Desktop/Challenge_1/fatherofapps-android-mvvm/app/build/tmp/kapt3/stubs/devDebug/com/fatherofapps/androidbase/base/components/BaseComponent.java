package com.fatherofapps.androidbase.base.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/fatherofapps/androidbase/base/components/BaseComponent;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "createView", "Landroid/view/View;", "idComponent", "", "app_devDebug"})
public abstract class BaseComponent {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    
    public BaseComponent(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    protected final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract android.view.View createView();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String idComponent();
}