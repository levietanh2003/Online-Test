package com.fatherofapps.androidbase.data.apis;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J0\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u000eH\u0007J\b\u0010\u0016\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u00020\u00068GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/fatherofapps/androidbase/data/apis/CustomerApiTest;", "", "()V", "countryAPI", "Lcom/fatherofapps/androidbase/data/apis/CustomerAPI;", "instantExecutorRule", "Landroidx/arch/core/executor/testing/InstantTaskExecutorRule;", "getInstantExecutorRule", "()Landroidx/arch/core/executor/testing/InstantTaskExecutorRule;", "setInstantExecutorRule", "(Landroidx/arch/core/executor/testing/InstantTaskExecutorRule;)V", "mockServer", "Lokhttp3/mockwebserver/MockWebServer;", "enqueueResponse", "", "fileName", "", "headers", "", "responseCode", "", "setup", "stopService", "app_devDebug"})
@org.junit.runner.RunWith(value = androidx.test.ext.junit.runners.AndroidJUnit4.class)
public final class CustomerApiTest {
    @org.jetbrains.annotations.NotNull
    private androidx.arch.core.executor.testing.InstantTaskExecutorRule instantExecutorRule;
    private okhttp3.mockwebserver.MockWebServer mockServer;
    private com.fatherofapps.androidbase.data.apis.CustomerAPI countryAPI;
    
    public CustomerApiTest() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.junit.Rule
    public final androidx.arch.core.executor.testing.InstantTaskExecutorRule getInstantExecutorRule() {
        return null;
    }
    
    public final void setInstantExecutorRule(@org.jetbrains.annotations.NotNull
    androidx.arch.core.executor.testing.InstantTaskExecutorRule p0) {
    }
    
    @org.junit.Before
    public final void setup() {
    }
    
    @org.junit.After
    public final void stopService() {
    }
    
    private final void enqueueResponse(java.lang.String fileName, java.util.Map<java.lang.String, java.lang.String> headers, int responseCode) {
    }
}