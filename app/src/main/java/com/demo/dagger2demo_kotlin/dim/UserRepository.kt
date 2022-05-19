package com.demo.dagger2demo_kotlin.dim

import com.demo.dagger2demo_kotlin.di.RetroServiceInterface
import javax.inject.Inject

// @Inject lets Dagger know how to create instances of this object
class UserRepository @Inject constructor(
    private val retroServiceInterface: RetroServiceInterface
) {}