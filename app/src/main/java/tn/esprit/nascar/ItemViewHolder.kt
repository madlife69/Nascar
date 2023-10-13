package tn.esprit.nascar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val imageView: ImageView = itemView.findViewById(R.id.eventImage1)
    val titleTextView: TextView = itemView.findViewById(R.id.eventTitle1)
    val descriptionTextView: TextView = itemView.findViewById(R.id.newsDescription1)

}