package com.yveskalumenoble.meetme.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.yveskalumenoble.meetme.databinding.UserItemBinding
import com.yveskalumenoble.meetme.models.User

class UsersAdapter(val clickListener: OnItemClickListener) : ListAdapter<User,UsersAdapter.UsersViewHolder>(Companion){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsersViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = UserItemBinding.inflate(layoutInflater,parent,false)
        return UsersViewHolder(binding)
    }


    override fun onBindViewHolder(holder: UsersViewHolder, position: Int) {
        val user: User = getItem(position)
        val binding = holder.binding
        binding.user = user
        binding.root.setOnClickListener {
            clickListener.onItemClick(user)
        }
    }

    companion object : DiffUtil.ItemCallback<User>() {
        override fun areItemsTheSame(oldItem: User, newItem: User): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: User, newItem: User): Boolean {
            return oldItem == newItem
        }
    }

    class UsersViewHolder(val binding: UserItemBinding) : RecyclerView.ViewHolder(binding.root)

    interface OnItemClickListener {
        fun onItemClick(user: User)
    }
}