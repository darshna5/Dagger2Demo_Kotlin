package com.demo.dagger2demo_kotlin.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.demo.dagger2demo_kotlin.R
import com.demo.dagger2demo_kotlin.RecyclerViewAdapter
import com.demo.dagger2demo_kotlin.di.viewmodel.UserViewModel
import com.demo.dagger2demo_kotlin.model.RecyclerList
import kotlinx.android.synthetic.main.activity_common.*
import kotlinx.android.synthetic.main.activity_main.*

class CoroutinesSingleCallActivity : AppCompatActivity() {
    private lateinit var recyclerViewAdapter: RecyclerViewAdapter
    private lateinit var userViewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_common)

        initRecyclerView()
        initViewModel()
    }

    private fun initRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerViewAdapter = RecyclerViewAdapter()
        recyclerView.adapter = recyclerViewAdapter
    }

    private fun initViewModel() {
        userViewModel = ViewModelProvider(this).get(UserViewModel::class.java)
        userViewModel.getLiveDataObserver().observe(this, object :Observer<RecyclerList>{
            override fun onChanged(t: RecyclerList?) {
                if(t != null) {
                    recyclerViewAdapter.setUpdatedData(t.items)
                    recyclerViewAdapter.notifyDataSetChanged()
                } else {
                    Toast.makeText(this@CoroutinesSingleCallActivity, "error in getting the date", Toast.LENGTH_SHORT).show()

                }
            }
        })
        userViewModel.makeApicall()
    }
}