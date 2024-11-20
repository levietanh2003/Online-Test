package com.fatherofapps.androidbase.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0007J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\fH\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/fatherofapps/androidbase/di/NetworkModule;", "", "()V", "provideConvertAPI", "Lcom/fatherofapps/androidbase/data/apis/ConvertAPI;", "retrofit", "Lretrofit2/Retrofit;", "provideFastForexAPI", "Lcom/fatherofapps/androidbase/data/apis/FastForexAPI;", "provideHttpLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideMoshiConverterFactory", "Lretrofit2/converter/moshi/MoshiConverterFactory;", "provideOKHttpClient", "Lokhttp3/OkHttpClient;", "httpLoggingInterceptor", "provideRetrofit", "okHttpClient", "moshiConverterFactory", "app_devDebug"})
@dagger.Module
public final class NetworkModule {
    
    public NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Named(value = "fastFOREX")
    @javax.inject.Singleton
    @dagger.Provides
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull
    retrofit2.converter.moshi.MoshiConverterFactory moshiConverterFactory) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.fatherofapps.androidbase.data.apis.FastForexAPI provideFastForexAPI(@org.jetbrains.annotations.NotNull
    @javax.inject.Named(value = "fastFOREX")
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.fatherofapps.androidbase.data.apis.ConvertAPI provideConvertAPI(@org.jetbrains.annotations.NotNull
    @javax.inject.Named(value = "fastFOREX")
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final okhttp3.OkHttpClient provideOKHttpClient(@org.jetbrains.annotations.NotNull
    okhttp3.logging.HttpLoggingInterceptor httpLoggingInterceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final okhttp3.logging.HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final retrofit2.converter.moshi.MoshiConverterFactory provideMoshiConverterFactory() {
        return null;
    }
}