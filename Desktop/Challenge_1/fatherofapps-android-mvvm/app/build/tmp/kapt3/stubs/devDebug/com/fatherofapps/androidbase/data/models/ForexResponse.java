package com.fatherofapps.androidbase.data.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\nH\u00c6\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\nH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001e"}, d2 = {"Lcom/fatherofapps/androidbase/data/models/ForexResponse;", "", "base", "", "amount", "", "result", "", "", "ms", "", "(Ljava/lang/String;FLjava/util/Map;I)V", "getAmount", "()F", "getBase", "()Ljava/lang/String;", "getMs", "()I", "getResult", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_devDebug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class ForexResponse {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String base = null;
    private final float amount = 0.0F;
    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, java.lang.Double> result = null;
    private final int ms = 0;
    
    @org.jetbrains.annotations.NotNull
    public final com.fatherofapps.androidbase.data.models.ForexResponse copy(@org.jetbrains.annotations.NotNull
    java.lang.String base, float amount, @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.Double> result, int ms) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public ForexResponse(@org.jetbrains.annotations.NotNull
    java.lang.String base, float amount, @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.Double> result, int ms) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBase() {
        return null;
    }
    
    public final float component2() {
        return 0.0F;
    }
    
    public final float getAmount() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, java.lang.Double> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, java.lang.Double> getResult() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getMs() {
        return 0;
    }
}