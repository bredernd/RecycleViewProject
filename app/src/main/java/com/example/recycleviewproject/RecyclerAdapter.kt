package com.example.recycleviewproject


import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar


class RecyclerAdapter(private val data: Data) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
   private val shuffledIndices = (0 until data.titles.size).shuffled()

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.card_layout, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        val dataIndex = shuffledIndices[i]
        viewHolder.itemTitle.text = data.titles[i]
        viewHolder.itemDetail.text = data.details[i]
        viewHolder.itemImage.setImageResource(data.images[dataIndex])
    }

    override fun getItemCount(): Int {
        return data.titles.size
    }

    fun setOnItemClickListener(Listener: (Int) -> Unit) {

    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.itemImage)
            itemTitle = itemView.findViewById(R.id.itemTitle)
            itemDetail = itemView.findViewById(R.id.itemDetail)

            itemView.setOnClickListener { v: View  ->
                val position: Int = adapterPosition + 1

                Snackbar.make(v, "Click detected on item $position",
                    Snackbar.LENGTH_LONG).setAction("Action", null).show()

            }
        }


    }

}