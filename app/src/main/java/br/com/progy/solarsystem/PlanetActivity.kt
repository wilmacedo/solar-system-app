package br.com.progy.solarsystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import br.com.progy.solarsystem.model.mockedPlanets

class PlanetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planet)

        val actionBar : ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayShowHomeEnabled(true)

        val planet = mockedPlanets()[intent.getIntExtra("position", 0)]

        actionBar.title = planet.name

        var description : TextView = findViewById(R.id.item_description)
        description.text = planet.description

        var type : TextView = findViewById(R.id.item_type)
        type.text = planet.type.toString()
    }
}