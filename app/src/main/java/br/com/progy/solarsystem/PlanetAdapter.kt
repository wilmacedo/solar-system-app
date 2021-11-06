package br.com.progy.solarsystem

import android.graphics.Color
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.annotation.ColorInt
import androidx.recyclerview.widget.RecyclerView
import br.com.progy.solarsystem.model.Planet
import kotlinx.android.synthetic.main.planet_item.view.*

class PlanetAdapter(
    private val planets: List<Planet>,
    private val listener: OnItemClickListener
    ) : RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.planet_item, parent, false)
        return PlanetViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlanetViewHolder, position: Int) {
        holder.bind(planets[position])
    }

    override fun getItemCount(): Int = planets.size

    inner class PlanetViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            if (adapterPosition != RecyclerView.NO_POSITION) {
                listener.onItemClick(adapterPosition)
            }
        }

        fun bind(planet: Planet) {
            with(planet) {
                val hash = type.hashCode()

                itemView.txt_name.text = name
                itemView.txt_icon.text = type.toString().first().toString()
                itemView.txt_icon.background = itemView.oval(Color.rgb(hash, hash / 2, 0))
                itemView.txt_description.text = description
            }
        }
    }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    fun View.oval(@ColorInt color: Int): ShapeDrawable {
        val oval = ShapeDrawable(OvalShape())
        with (oval) {
            intrinsicHeight = height
            intrinsicWidth = width
            paint.color = color
        }
        return oval
    }
}