package com.example.surprise_eggs_store.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.surprise_eggs_store.R
import com.example.surprise_eggs_store.data.model.Figure

class FigureAdapter(
    private val dataset: List<Figure>
) : RecyclerView.Adapter<FigureAdapter.ViewHolder>() {

    /**
     * der ViewHolder umfasst die View uns stellt einen Listeneintrag dar
     */
    inner class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        // TODO Schreibe hier deinen Code
        val  figureImage = view.findViewById<ImageView>(R.id.figure_image)
        val price = view.findViewById<TextView>(R.id.price_text)
        val figureName = view.findViewById<TextView>(R.id.figure_name_text)
    }

    /**
     * hier werden neue ViewHolder erstellt
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        // das itemLayout wird gebaut
        // TODO Schreibe hier deinen Code
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.figure_item, parent, false)

        // und in einem ViewHolder zurückgegeben
        return ViewHolder(adapterLayout)                     //TODO()
    }

    /**
     * hier findet der Recyclingprozess statt
     * die vom ViewHolder bereitgestellten Parameter erhalten die Information des Listeneintrags
     */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // TODO Schreibe hier deinen Code
        val figure = dataset[position]

        holder.figureImage.setImageResource(figure.imageResource)
        holder.figureName.text = figure.name
        holder. price.text = "${figure.price} Euro"


    }

    /**
     * damit der LayoutManager weiß, wie lang die Liste ist
     */
    override fun getItemCount(): Int {
        return dataset.size       //TODO()
    }
}