package tn.esprit.nascar

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class NewAdapter(private val items: List<ItemNewModel>) : RecyclerView.Adapter<ItemNewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemNewViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_news_layout, parent, false)
        return ItemNewViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemNewViewHolder, position: Int) {
        val item = items[position]
        holder.imageView.setImageResource(item.image)
        holder.titleTextView.text = item.title
        holder.descriptionTextView.text = item.description

    }

    override fun getItemCount(): Int {
        return items.size
    }
}