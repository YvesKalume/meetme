package com.yveskalumenoble.meetme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.yveskalumenoble.meetme.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController = Navigation.findNavController(this , R.id.mainFragment)
        setupBottomBar(navController)
    }

    fun setupBottomBar(navController: NavController){
        bottomNav?.let {
            NavigationUI.setupWithNavController(it,navController)
        }
    }
}
