package br.com.progy.solarsystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.progy.solarsystem.model.Planet
import br.com.progy.solarsystem.model.mockedPlanets
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), PlanetAdapter.OnItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = PlanetAdapter(mockedPlanets(), this)

        recycler_view_main.adapter = adapter
        recycler_view_main.layoutManager = LinearLayoutManager(this)
    }

    override fun onItemClick(position: Int) {
        var intent = Intent(this, PlanetActivity::class.java)
        intent.putExtra("position", position)

        this.startActivity(intent)
    }
}