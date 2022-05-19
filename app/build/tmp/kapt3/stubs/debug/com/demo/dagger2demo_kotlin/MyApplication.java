package com.demo.dagger2demo_kotlin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/demo/dagger2demo_kotlin/MyApplication;", "Landroid/app/Application;", "()V", "retroComponent", "Lcom/demo/dagger2demo_kotlin/di/RetroComponent;", "getRetroComponent", "onCreate", "", "app_debug"})
public final class MyApplication extends android.app.Application {
    private com.demo.dagger2demo_kotlin.di.RetroComponent retroComponent;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.demo.dagger2demo_kotlin.di.RetroComponent getRetroComponent() {
        return null;
    }
    
    public MyApplication() {
        super();
    }
}