package com.demo.dagger2demo_kotlin.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/demo/dagger2demo_kotlin/di/RetroComponent;", "", "inject", "", "mainActivityViewModel", "Lcom/demo/dagger2demo_kotlin/di/viewmodel/MainActivityViewModel;", "parallelCallCoroutineViewModel", "Lcom/demo/dagger2demo_kotlin/di/viewmodel/ParallelCallCoroutineViewModel;", "userViewModel", "Lcom/demo/dagger2demo_kotlin/di/viewmodel/UserViewModel;", "app_debug"})
@dagger.Component(modules = {com.demo.dagger2demo_kotlin.di.RetroModule.class})
@javax.inject.Singleton()
public abstract interface RetroComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.demo.dagger2demo_kotlin.di.viewmodel.MainActivityViewModel mainActivityViewModel);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.demo.dagger2demo_kotlin.di.viewmodel.UserViewModel userViewModel);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.demo.dagger2demo_kotlin.di.viewmodel.ParallelCallCoroutineViewModel parallelCallCoroutineViewModel);
}