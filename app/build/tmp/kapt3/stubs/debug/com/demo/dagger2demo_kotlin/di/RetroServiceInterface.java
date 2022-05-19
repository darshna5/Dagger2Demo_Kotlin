package com.demo.dagger2demo_kotlin.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/demo/dagger2demo_kotlin/di/RetroServiceInterface;", "", "getDataFromAPI", "Lretrofit2/Call;", "Lcom/demo/dagger2demo_kotlin/model/RecyclerList;", "query", "", "getMyDataFromAPI", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface RetroServiceInterface {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "repositories")
    public abstract retrofit2.Call<com.demo.dagger2demo_kotlin.model.RecyclerList> getDataFromAPI(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String query);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "repositories")
    public abstract java.lang.Object getMyDataFromAPI(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.demo.dagger2demo_kotlin.model.RecyclerList> p1);
}