package com.example.appfragmentsejercicio

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.appfragmentsejercicio.ui.main.SectionsPagerAdapter
//SE HA USADO LA UI PREDEFINIDA DE "TABS" PARA HACER ESTE EJERCICIO
//NO TENEMOS POR QUÉ ENTENDERLO TODOx, INTENTAR HACER UNA APP SIMPLE QUE USE FRAGMENTS A PARTIR DE ESTOS PREDEFINIDOS
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)
        val fab: FloatingActionButton = findViewById(R.id.fab)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Enviar mensaje", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }
}