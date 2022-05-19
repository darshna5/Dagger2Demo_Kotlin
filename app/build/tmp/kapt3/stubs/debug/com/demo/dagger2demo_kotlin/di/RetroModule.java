package com.demo.dagger2demo_kotlin.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/demo/dagger2demo_kotlin/di/RetroModule;", "", "()V", "baseURL", "", "getBaseURL", "()Ljava/lang/String;", "getRetroFitInstance", "Lretrofit2/Retrofit;", "getRetroServiceInterface", "Lcom/demo/dagger2demo_kotlin/di/RetroServiceInterface;", "retrofit", "app_debug"})
@dagger.Module()
public final class RetroModule {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String baseURL = "https://api.github.com/search/";
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBaseURL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.demo.dagger2demo_kotlin.di.RetroServiceInterface getRetroServiceInterface(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit getRetroFitInstance() {
        return null;
    }
    
    public RetroModule() {
        super();
    }
}