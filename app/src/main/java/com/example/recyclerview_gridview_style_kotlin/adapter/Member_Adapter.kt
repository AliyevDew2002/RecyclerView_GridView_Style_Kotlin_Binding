package com.example.recyclerview_gridview_style_kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_gridview_style_kotlin.databinding.MemberListQolipBinding
import com.example.recyclerview_gridview_style_kotlin.model.Member


class Member_Adapter(context: Context, members: ArrayList<Member>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var context: Context
    var members: ArrayList<Member>
    var binding: MemberListQolipBinding? = null

    init {
        this.members = members
        this.context = context
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: MemberListQolipBinding = MemberListQolipBinding.inflate(layoutInflater)
        return CustomViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val member: Member = members[position]
        if (holder is CustomViewHolder) {
            val profile: ImageView = holder.binding.ivProfile
            val firstName: TextView = holder.binding.tvFirstname
            val lestName: TextView = holder.binding.tvLestName
            profile.setImageResource(member.getProfilee())
            firstName.setText(member.getFirstNamee())
            lestName.setText(member.getLestNamee())
        }
    }

    inner class CustomViewHolder(var binding: MemberListQolipBinding) :
        RecyclerView.ViewHolder(binding.getRoot())


//    inner class CustomViewHolder(val binding: MemberListQolipBinding) :
//        RecyclerView.ViewHolder(binding.root)


    override fun getItemCount(): Int {
        return members.size
    }
}