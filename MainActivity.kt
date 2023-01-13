package com.example.surprise_eggs_store

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.surprise_eggs_store.adapter.CategoryAdapter
import com.example.surprise_eggs_store.data.DataSource
import com.example.surprise_eggs_store.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val datasource = DataSource()
        val categoryList = datasource.getFigures()

        binding.categoryRecycler.adapter = CategoryAdapter(categoryList)
    }
}