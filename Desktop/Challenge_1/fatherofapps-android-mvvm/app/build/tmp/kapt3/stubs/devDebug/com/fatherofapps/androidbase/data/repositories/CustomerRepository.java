package com.fatherofapps.androidbase.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/fatherofapps/androidbase/data/repositories/CustomerRepository;", "", "customerRemoteService", "Lcom/fatherofapps/androidbase/data/services/CustomerRemoteService;", "customerLocalService", "Lcom/fatherofapps/androidbase/data/services/CustomerLocalService;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/fatherofapps/androidbase/data/services/CustomerRemoteService;Lcom/fatherofapps/androidbase/data/services/CustomerLocalService;Lkotlinx/coroutines/CoroutineDispatcher;)V", "app_devDebug"})
public final class CustomerRepository {
    private final com.fatherofapps.androidbase.data.services.CustomerRemoteService customerRemoteService = null;
    private final com.fatherofapps.androidbase.data.services.CustomerLocalService customerLocalService = null;
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher = null;
    
    public CustomerRepository(@org.jetbrains.annotations.NotNull
    com.fatherofapps.androidbase.data.services.CustomerRemoteService customerRemoteService, @org.jetbrains.annotations.NotNull
    com.fatherofapps.androidbase.data.services.CustomerLocalService customerLocalService, @org.jetbrains.annotations.NotNull
    @com.fatherofapps.androidbase.di.IoDispatcher
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        super();
    }
}