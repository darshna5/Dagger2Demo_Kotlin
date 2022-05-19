package com.demo.dagger2demo_kotlin.di.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.demo.dagger2demo_kotlin.MyApplication
import com.demo.dagger2demo_kotlin.di.RetroServiceInterface
import com.demo.dagger2demo_kotlin.model.RecyclerList
import kotlinx.coroutines.launch
import javax.inject.Inject

class UserViewModel (
    application: Application
):AndroidViewModel(application) {

    @Inject
    lateinit var mService: RetroServiceInterface

    private lateinit var liveDataList: MutableLiveData<RecyclerList>


    init {
        //here we need to init application.
        (application as MyApplication).getRetroComponent().inject(this)
        liveDataList = MutableLiveData()
    }


    fun getLiveDataObserver(): MutableLiveData<RecyclerList> {
        return liveDataList

    }

     fun makeApicall() {
        viewModelScope.launch {
            try {
                var list:RecyclerList? =   mService.getMyDataFromAPI("atl")
                liveDataList.postValue(list)
            } catch (e: Exception) {
                liveDataList.postValue(null)
            }
        }
    }
}