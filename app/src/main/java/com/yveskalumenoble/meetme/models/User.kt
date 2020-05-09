package com.yveskalumenoble.meetme.models

import com.yveskalumenoble.meetme.R

data class User(var id: Int,var name: String, var age: Int, var picture: Int){

    companion object DataList {
        val users = listOf<User>(
            User(1,"Laura",24,R.drawable.team3),
            User(2,"John", 21,R.drawable.team1),
            User(3,"Elodie", 25,R.drawable.team2),
            User(4,"Yvan",22,R.drawable.team6),
            User(5,"Yasmine",20,R.drawable.team4),
            User(6,"Chris",30,R.drawable.team7),
            User(7,"Clara",20,R.drawable.team5),
            User(8,"Jackie",30,R.drawable.team8)
        )
    }
}