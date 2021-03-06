package com.demo.dagger2demo_kotlin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/demo/dagger2demo_kotlin/RecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/demo/dagger2demo_kotlin/RecyclerViewAdapter$MyViewHolder;", "()V", "listData", "", "Lcom/demo/dagger2demo_kotlin/model/RecyclerData;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setUpdatedData", "MyViewHolder", "app_debug"})
public final class RecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.demo.dagger2demo_kotlin.RecyclerViewAdapter.MyViewHolder> {
    private java.util.List<com.demo.dagger2demo_kotlin.model.RecyclerData> listData;
    
    public final void setUpdatedData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.demo.dagger2demo_kotlin.model.RecyclerData> listData) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.demo.dagger2demo_kotlin.RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.demo.dagger2demo_kotlin.RecyclerViewAdapter.MyViewHolder holder, int position) {
    }
    
    public RecyclerViewAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u0014"}, d2 = {"Lcom/demo/dagger2demo_kotlin/RecyclerViewAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "imageView", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getImageView", "()Landroid/widget/ImageView;", "textviewDescription", "Landroid/widget/TextView;", "getTextviewDescription", "()Landroid/widget/TextView;", "textviewName", "getTextviewName", "bind", "", "data", "Lcom/demo/dagger2demo_kotlin/model/RecyclerData;", "app_debug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.ImageView imageView = null;
        private final android.widget.TextView textviewName = null;
        private final android.widget.TextView textviewDescription = null;
        
        public final android.widget.ImageView getImageView() {
            return null;
        }
        
        public final android.widget.TextView getTextviewName() {
            return null;
        }
        
        public final android.widget.TextView getTextviewDescription() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.demo.dagger2demo_kotlin.model.RecyclerData data) {
        }
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}