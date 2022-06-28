package com.example.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bottomnavigation.Fragments.CallFragment
import com.example.bottomnavigation.Fragments.ChatsFragment
import com.example.bottomnavigation.Fragments.StatusFragment
import com.example.bottomnavigation.adapter.ViewpagetAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewpager.adapter = ViewpagetAdapter(supportFragmentManager)
    }

}