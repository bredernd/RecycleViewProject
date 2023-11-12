package com.example.recycleviewproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycleviewproject.databinding.ActivityMainBinding
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null
    private val data = Data()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        layoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = layoutManager
       // binding.recyclerView.layoutManager = layoutManager
        adapter = RecyclerAdapter(data)
        //binding.recyclerView.adapter = adapter
        binding.recyclerView.adapter = adapter



        data.shuffleData()

    }
}