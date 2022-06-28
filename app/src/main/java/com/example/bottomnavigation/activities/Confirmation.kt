package com.example.bottomnavigation.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bottomnavigation.R
import com.example.bottomnavigation.adapter.ViewpagetAdapter
import com.example.myapplication.Money
import kotlinx.android.synthetic.main.activity_confirmation.*
import kotlinx.android.synthetic.main.fragment_view_transaction.*

class Confirmation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmation)
        viewpager.adapter = ViewpagetAdapter(supportFragmentManager)

    }
}