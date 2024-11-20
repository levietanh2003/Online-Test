package com.fatherofapps.androidbase.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/fatherofapps/androidbase/di/CoroutinesDispatchersModule;", "", "()V", "providesDefaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "providesIoDispatcher", "providesMainDispatcher", "providesMainImmediateDispatcher", "app_devDebug"})
@dagger.Module
public final class CoroutinesDispatchersModule {
    @org.jetbrains.annotations.NotNull
    public static final com.fatherofapps.androidbase.di.CoroutinesDispatchersModule INSTANCE = null;
    
    private CoroutinesDispatchersModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @DefaultDispatcher
    public final kotlinx.coroutines.CoroutineDispatcher providesDefaultDispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @IoDispatcher
    public final kotlinx.coroutines.CoroutineDispatcher providesIoDispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @MainDispatcher
    public final kotlinx.coroutines.CoroutineDispatcher providesMainDispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @MainImmediateDispatcher
    @dagger.Provides
    public final kotlinx.coroutines.CoroutineDispatcher providesMainImmediateDispatcher() {
        return null;
    }
}