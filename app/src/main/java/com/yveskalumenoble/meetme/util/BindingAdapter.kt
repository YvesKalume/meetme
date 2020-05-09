package com.yveskalumenoble.meetme.util

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.yveskalumenoble.meetme.models.User

@BindingAdapter("userName")
fun TextView.setUserName(item: User){
    text = item.name
}

@BindingAdapter("userAge")
fun TextView.setUserAge(item: User){
    text = "${item.age} ans"
}

@BindingAdapter("userImage")
fun ImageView.setUserImage(item: User){
    setImageResource(item.picture)
}