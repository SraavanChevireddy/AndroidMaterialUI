package com.example.bottomnavigation.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bottomnavigation.R
import com.example.bottomnavigation.adapter.ViewpagetAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        viewpager.adapter = ViewpagetAdapter(supportFragmentManager)
    }

}