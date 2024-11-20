package com.fatherofapps.androidbase.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B-\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/fatherofapps/androidbase/ui/adapters/CurrencyAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/fatherofapps/androidbase/ui/adapters/CurrencyAdapter$CurrencyViewHolder;", "currencies", "", "", "onItemClick", "Lkotlin/Function1;", "", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CurrencyViewHolder", "app_devDebug"})
public final class CurrencyAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.fatherofapps.androidbase.ui.adapters.CurrencyAdapter.CurrencyViewHolder> {
    private final java.util.Map<java.lang.String, java.lang.String> currencies = null;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onItemClick = null;
    
    public CurrencyAdapter(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.String> currencies, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onItemClick) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.fatherofapps.androidbase.ui.adapters.CurrencyAdapter.CurrencyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.fatherofapps.androidbase.ui.adapters.CurrencyAdapter.CurrencyViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/fatherofapps/androidbase/ui/adapters/CurrencyAdapter$CurrencyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/fatherofapps/androidbase/databinding/CurrencyItemBinding;", "(Lcom/fatherofapps/androidbase/databinding/CurrencyItemBinding;)V", "bind", "", "currencyCode", "", "currencyName", "app_devDebug"})
    public static final class CurrencyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.fatherofapps.androidbase.databinding.CurrencyItemBinding binding = null;
        
        public CurrencyViewHolder(@org.jetbrains.annotations.NotNull
        com.fatherofapps.androidbase.databinding.CurrencyItemBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        java.lang.String currencyCode, @org.jetbrains.annotations.Nullable
        java.lang.String currencyName) {
        }
    }
}