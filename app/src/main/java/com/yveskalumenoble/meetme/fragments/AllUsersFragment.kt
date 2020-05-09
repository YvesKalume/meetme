package com.yveskalumenoble.meetme.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager

import com.yveskalumenoble.meetme.R
import com.yveskalumenoble.meetme.adapters.UsersAdapter
import com.yveskalumenoble.meetme.databinding.FragmentAllUsersBinding
import com.yveskalumenoble.meetme.models.User
import kotlinx.android.synthetic.main.fragment_all_users.view.*

/**
 * A simple [Fragment] subclass.
 */
class AllUsersFragment : Fragment(),UsersAdapter.OnItemClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentAllUsersBinding.inflate(inflater,container,false)

        binding.usersRecycler.layoutManager = GridLayoutManager(activity,2)
        val adapter = UsersAdapter(this)
        adapter.submitList(User.users)
        binding.usersRecycler.adapter = adapter

        return binding.root
    }

    override fun onItemClick(user: User) {
        Toast.makeText(context,user.name,Toast.LENGTH_SHORT).show()
    }

}
