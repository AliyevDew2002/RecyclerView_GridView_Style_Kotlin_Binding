package com.example.recyclerview_gridview_style_kotlin.activity

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.recyclerview_gridview_style_kotlin.R
import com.example.recyclerview_gridview_style_kotlin.adapter.Member_Adapter
import com.example.recyclerview_gridview_style_kotlin.databinding.ActivityMainBinding
import com.example.recyclerview_gridview_style_kotlin.model.Member

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    var context: Context? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)
        initViews()
    }

    fun initViews() {
        context = this
        binding.recyclerView.setLayoutManager(GridLayoutManager(context, 2))
        refreshAdapter(prepareArrayList())
    }

    fun prepareArrayList(): ArrayList<Member> {
        val members: ArrayList<Member> = ArrayList<Member>()
        for (i in 0..30) {
            members.add(Member(R.drawable.ic_launcher_foreground, "Shaxzod Aliyev", "2002-yil"))
        }
        return members
    }

    fun refreshAdapter(members: ArrayList<Member>) {
        val adapter = Member_Adapter(this, members)
        binding.recyclerView.adapter=adapter
    }
}