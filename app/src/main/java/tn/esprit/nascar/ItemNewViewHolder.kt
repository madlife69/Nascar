package tn.esprit.nascar

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemNewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val imageView: ImageView = itemView.findViewById(R.id.eventImage2)
    val titleTextView: TextView = itemView.findViewById(R.id.newsTitle2)
    val descriptionTextView: TextView = itemView.findViewById(R.id.newsDescription2)

}