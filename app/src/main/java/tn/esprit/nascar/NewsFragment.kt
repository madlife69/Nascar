package tn.esprit.nascar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

//TODO 4 Change this class to a fragment and use binding to inflate fragment_news.xml

class NewsFragment : Fragment(R.layout.fragment_news) {
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_news, container, false)

        recyclerView = view.findViewById(R.id.recyclerView1)
        recyclerView.layoutManager = LinearLayoutManager(context)

        val items = listOf(
            ItemNewModel(R.drawable.ic_news1, "Item 1","fffffff"),
            ItemNewModel(R.drawable.ic_news2, "Item 2","ffffff"),
            ItemNewModel(R.drawable.ic_news3, "Item 3","fffffff"),
            ItemNewModel(R.drawable.ic_news1, "Item 1","fffffff"),
            ItemNewModel(R.drawable.ic_news2, "Item 2","ffffff"),
            ItemNewModel(R.drawable.ic_news3, "Item 3","fffffff"),
            ItemNewModel(R.drawable.ic_news1, "Item 1","fffffff"),
            ItemNewModel(R.drawable.ic_news2, "Item 2","ffffff"),
            ItemNewModel(R.drawable.ic_news3, "Item 3","fffffff"),


            // Ajoutez d'autres éléments ici
        )

        val adapter = NewAdapter(items)
        recyclerView.adapter = adapter

        return view
    }

}