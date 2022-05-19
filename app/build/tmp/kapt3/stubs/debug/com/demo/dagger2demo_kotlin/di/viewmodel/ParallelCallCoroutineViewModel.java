package com.demo.dagger2demo_kotlin.di.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0006\u0010\u000f\u001a\u00020\u0010R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0011"}, d2 = {"Lcom/demo/dagger2demo_kotlin/di/viewmodel/ParallelCallCoroutineViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "liveDataList", "Landroidx/lifecycle/MutableLiveData;", "Lcom/demo/dagger2demo_kotlin/model/RecyclerList;", "mService", "Lcom/demo/dagger2demo_kotlin/di/RetroServiceInterface;", "getMService", "()Lcom/demo/dagger2demo_kotlin/di/RetroServiceInterface;", "setMService", "(Lcom/demo/dagger2demo_kotlin/di/RetroServiceInterface;)V", "getLiveDataObserver", "makeApicall", "", "app_debug"})
public final class ParallelCallCoroutineViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.demo.dagger2demo_kotlin.di.RetroServiceInterface mService;
    private androidx.lifecycle.MutableLiveData<com.demo.dagger2demo_kotlin.model.RecyclerList> liveDataList;
    
    @org.jetbrains.annotations.NotNull()
    public final com.demo.dagger2demo_kotlin.di.RetroServiceInterface getMService() {
        return null;
    }
    
    public final void setMService(@org.jetbrains.annotations.NotNull()
    com.demo.dagger2demo_kotlin.di.RetroServiceInterface p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.demo.dagger2demo_kotlin.model.RecyclerList> getLiveDataObserver() {
        return null;
    }
    
    public final void makeApicall() {
    }
    
    public ParallelCallCoroutineViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}