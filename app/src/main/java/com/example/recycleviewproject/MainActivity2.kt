package com.example.recycleviewproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil.setContentView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val data = Data()
        val adapter = RecyclerAdapter(data)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        adapter.setOnItemClickListener { position ->
            val clickedTitle = data.titles[position]
            val clickedDetail = data.details[position]
            val clickedImageResId = data.images[position]

            val intent = Intent(this@MainActivity2, MainActivity::class.java).apply {
                putExtra("TITLE", clickedTitle)
                putExtra("DETAIL", clickedDetail)
                putExtra("IMAGE_RES_ID", clickedImageResId)

                fun onItemClick(title: String, detail: String, imageResId: Int) {
                    // Handle the item click here
                    val intent = Intent(this@MainActivity2, MainActivity::class.java).apply {
                        putExtra("TITLE", title)
                        putExtra("DETAIL", detail)
                        putExtra("IMAGE_RES_ID", imageResId)


                    }
                    startActivity(intent)
                }
            }
        }
    }
}



//import android.content.Intent
//import android.os.Bundle
//import android.widget.ImageView
//import android.widget.TextView
//import androidx.appcompat.app.AppCompatActivity
//
//class MainActivity2 : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.card_layout)
//
//        // Get references to your views (image, title, details)
//        val imageView = findViewById<ImageView>(R.id.itemImage)
//        val titleView = findViewById<TextView>(R.id.itemTitle)
//        val detailView = findViewById<TextView>(R.id.itemDetail)
//
//        // Set an onClickListener for the item
//        imageView.setOnClickListener {
//            val clickedTitle = "Your clicked title"
//            val clickedDetail = "Your clicked detail"
//            val clickedImageResId = R.drawable.android_image_1
//
//            val intent = Intent(this@MainActivity2, MainActivity::class.java)
//            intent.putExtra("TITLE", clickedTitle)
//            intent.putExtra("DETAIL", clickedDetail)
//            intent.putExtra("IMAGE_RES_ID", clickedImageResId)
//            startActivity(intent)
//        }
//    }
//}


//import android.content.Intent
//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//import androidx.lifecycle.ViewModelProvider
//import com.example.recycleviewproject.databinding.ActivityMain2Binding
//
//class MainActivity2 : AppCompatActivity() {
//    private lateinit var viewModel: MainViewModel
//    private lateinit var binding: ActivityMain2Binding // replace with your binding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        // ... (other initialization)
//
//        // Initialize ViewModel
//        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
//
//        // Set up your binding
//
//        // Set up RecyclerView and Adapter
//        val adapter = RecyclerAdapter(data) // Replace 'data' with your data object
//        // Set adapter to your RecyclerView
//
//        // Handle item click in the RecyclerView's Adapter
//        adapter.setOnItemClickListener { position ->
//            val clickedTitle = data.titles[position]
//            val clickedDetail = data.details[position]
//            val clickedImageResId = data.images[position]
//
//            // Set the selected item details in MainViewModel
//            viewModel.setSelectedItem(clickedTitle, clickedDetail, clickedImageResId)
//
//            // Create an Intent to go from MainActivity2 to MainActivity
//            val intent = Intent(this@MainActivity2, MainActivity::class.java)
//
//            // Start MainActivity using startActivity()
//            startActivity(intent)
//        }
//    }
//}


//import android.content.Intent
//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.content.ContextCompat
//import androidx.lifecycle.ViewModelProvider
//import com.example.recycleviewproject.databinding.ActivityMain2Binding
//
//class MainActivity2 : AppCompatActivity() {
//    private lateinit var viewModel: MainViewModel
//    private lateinit var binding: ActivityMain2Binding // replace with your binding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        // ... (other initialization)
//
//        // Initialize ViewModel
//        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
//
//        // Set up your binding
//
//        // Set up RecyclerView and Adapter
//        val adapter = RecyclerAdapter(data) // Replace 'data' with your data object
//        // Set adapter to your RecyclerView
//
//        // Handle item click in the RecyclerView's Adapter
//        adapter.setOnItemClickListener { position ->
//            val clickedTitle = data.titles[position]
//            val clickedDetail = data.details[position]
//            val clickedImageResId = data.images[position]
//
//            // Set the selected item details in MainViewModel
//            viewModel.setSelectedItem(clickedTitle, clickedDetail, clickedImageResId)
//
//            // Create an Intent to go from MainActivity2 to MainActivity
//            val intent = Intent(this@MainActivity2, MainActivity::class.java)
//
//            // Start MainActivity using ContextCompat.startActivity()
//            ContextCompat.startActivity(this@MainActivity2, intent, null)
//        }
//    }
//}
//
