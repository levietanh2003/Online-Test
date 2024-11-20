package com.fatherofapps.androidbase.di

import com.fatherofapps.androidbase.BuildConfig
import com.fatherofapps.androidbase.data.apis.*

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Provides
    @Singleton
    @Named("fastFOREX")
    fun provideRetrofit(
        okHttpClient: OkHttpClient,
        moshiConverterFactory: MoshiConverterFactory
    ): Retrofit {

        return Retrofit.Builder()
            .addConverterFactory(moshiConverterFactory)
            .baseUrl(BuildConfig.BASE_URL)
            .client(okHttpClient)
            .build()

    }

    @Provides
    fun provideFastForexAPI(@Named("fastFOREX") retrofit: Retrofit): FastForexAPI {
        return retrofit.create(FastForexAPI::class.java)
    }

    @Provides
    fun provideConvertAPI(@Named("fastFOREX") retrofit: Retrofit): ConvertAPI {
        return retrofit.create(ConvertAPI::class.java)
    }

    @Provides
    @Singleton
    fun provideOKHttpClient(
        httpLoggingInterceptor: HttpLoggingInterceptor
    ): OkHttpClient {
        val builder = OkHttpClient.Builder()

        // Interceptor để thêm ACCESS_TOKEN vào mọi yêu cầu
        builder.addInterceptor { chain ->
            val originalRequest = chain.request()
            val originalUrl = originalRequest.url

            // Thêm ACCESS_TOKEN vào query parameters
            val newUrl = originalUrl.newBuilder()
                .addQueryParameter("api_key", BuildConfig.ACCESS_TOKEN)
                .build()

            val newRequest = originalRequest.newBuilder()
                .url(newUrl)
                .build()

            chain.proceed(newRequest)
        }

        builder.addInterceptor(httpLoggingInterceptor)
        return builder.build()
    }


    @Provides
    @Singleton
    fun provideHttpLoggingInterceptor(): HttpLoggingInterceptor {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return httpLoggingInterceptor
    }

    @Provides
    @Singleton
    fun provideMoshiConverterFactory(): MoshiConverterFactory {
        val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
        return MoshiConverterFactory.create(moshi)
    }

}