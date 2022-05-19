package com.demo.dagger2demo_kotlin.di.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.demo.dagger2demo_kotlin.MyApplication
import com.demo.dagger2demo_kotlin.di.RetroServiceInterface
import com.demo.dagger2demo_kotlin.model.RecyclerData
import com.demo.dagger2demo_kotlin.model.RecyclerList
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import javax.inject.Inject

class ParallelCallCoroutineViewModel constructor(application: Application) :
    AndroidViewModel(application) {
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
                // coroutineScope is needed, else in case of any network error, it will crash
                coroutineScope {
                    val usersFromApiDeferred = async { mService.getMyDataFromAPI("atl") }
                    val moreUsersFromApiDeferred = async { mService.getMyDataFromAPI("atl") }

                    val usersFromApi: RecyclerList? = usersFromApiDeferred.await()
                    val moreUsersFromApi: RecyclerList? = moreUsersFromApiDeferred.await()

                    val allUsersFromApi = mutableListOf<RecyclerData?>()
                    allUsersFromApi.addAll(usersFromApi!!.items)
                    allUsersFromApi.addAll(moreUsersFromApi!!.items)
                    val recyclerList = RecyclerList(items = allUsersFromApi as List<RecyclerData>)
                    liveDataList.postValue(recyclerList)

                }
            } catch (e: Exception) {
                liveDataList.postValue(null)
            }
        }
    }
}