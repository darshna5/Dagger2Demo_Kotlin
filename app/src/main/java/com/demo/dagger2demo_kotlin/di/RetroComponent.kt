package com.demo.dagger2demo_kotlin.di

import com.demo.dagger2demo_kotlin.di.viewmodel.MainActivityViewModel
import com.demo.dagger2demo_kotlin.di.viewmodel.ParallelCallCoroutineViewModel
import com.demo.dagger2demo_kotlin.di.viewmodel.UserViewModel
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [RetroModule::class])
interface RetroComponent {

    fun inject(mainActivityViewModel: MainActivityViewModel)

    // The return type  of functions inside the component interface is
    // what can be provided from the container
    fun inject(userViewModel: UserViewModel)

    fun inject(parallelCallCoroutineViewModel: ParallelCallCoroutineViewModel)


}