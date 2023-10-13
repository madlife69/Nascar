package tn.esprit.nascar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

//TODO 5 Change this class to a fragment and use binding to inflate fragment_events.xml

class EventsFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_events, container, false)
99
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)

        val items = listOf(
            ItemModel(R.drawable.ic_event2, "Item 1","fffffff"),
            ItemModel(R.drawable.ic_event3, "Item 2","ffffff"),
            ItemModel(R.drawable.ic_event4, "Item 3","fffffff"),
            ItemModel(R.drawable.ic_event2, "Item 1","fffffff"),
            ItemModel(R.drawable.ic_event3, "Item 2","ffffff"),
            ItemModel(R.drawable.ic_event4, "Item 3","fffffff"),
            ItemModel(R.drawable.ic_event2, "Item 1","fffffff"),
            ItemModel(R.drawable.ic_event3, "Item 2","ffffff"),
            ItemModel(R.drawable.ic_event4, "Item 3","fffffff"),
            ItemModel(R.drawable.ic_event2, "Item 1","fffffff"),
            ItemModel(R.drawable.ic_event3, "Item 2","ffffff"),
            ItemModel(R.drawable.ic_event4, "Item 3","fffffff"),
            ItemModel(R.drawable.ic_event2, "Item 1","fffffff"),
            ItemModel(R.drawable.ic_event3, "Item 2","ffffff"),
            ItemModel(R.drawable.ic_event4, "Item 3","fffffff"),
            ItemModel(R.drawable.ic_event2, "Item 1","fffffff"),
            ItemModel(R.drawable.ic_event3, "Item 2","ffffff"),
            ItemModel(R.drawable.ic_event4, "Item 3","fffffff"),
            ItemModel(R.drawable.ic_event2, "Item 1","fffffff"),
            ItemModel(R.drawable.ic_event3, "Item 2","ffffff"),
            ItemModel(R.drawable.ic_event4, "Item 3","fffffff"),
            ItemModel(R.drawable.ic_event2, "Item 1","fffffff"),
            ItemModel(R.drawable.ic_event3, "Item 2","ffffff"),
            ItemModel(R.drawable.ic_event4, "Item 3","fffffff"),
            ItemModel(R.drawable.ic_event2, "Item 1","fffffff"),
            ItemModel(R.drawable.ic_event3, "Item 2","ffffff"),
            ItemModel(R.drawable.ic_event4, "Item 3","fffffff"),

            // Ajoutez d'autres éléments ici
        )

        val adapter = ItemAdapter(items)
        recyclerView.adapter = adapter

        return view
    }
}
