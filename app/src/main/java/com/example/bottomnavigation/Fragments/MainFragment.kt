package com.example.bottomnavigation.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.bottomnavigation.R


class MainFragment : Fragment(),View.OnClickListener {

    lateinit var navController : NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.view_transactions_btn).setOnClickListener(this)
        view.findViewById<Button>(R.id.send_money_btn).setOnClickListener(this)
        view.findViewById<Button>(R.id.view_balance_btn).setOnClickListener(this)

    }

    override fun onClick(v: View?) {

        when (v!!.id)
        {
            R.id.view_transactions_btn ->navController!!.navigate(R.id.action_mainFragment_to_viewTransactionFragment)
            R.id.view_balance_btn-> navController!!.navigate(R.id.action_mainFragment_to_viewBalanceFragment)

        }
    }

}
