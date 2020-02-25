package com.example.appfragmentsejercicio.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.appfragmentsejercicio.R

//EN ESTE ARRAY AÑADIMOS LAS TABS QUE SE VAN A MOSTRAR
//PARA CAMBIAR EL NOMBRE O AÑADIR TABS, IR AL FICHERO STRINGS Y CREAR UNA NUEVA VARIABLE
private val TAB_TITLES = arrayOf(
    R.string.tab_text_1,
    R.string.tab_text_2,
    //"R" ES UNA FORMA DE ACCEDER A LA CARPETA DE VALUES, PONEMOS UNA VARIABLE STRING MÁS Y LA METEMOS EN ESTE ARRAY
    R.string.tab_text_3

)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {
    //FUNCIÓN PARA IR INSTANCIANDO LOS FRAGMENT A TRAVÉS DEL "PlaceHolder" Y UN ID DISTINTO PARA CADA UNO
    override fun getItem(position: Int): Fragment {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return PlaceholderFragment.newInstance(position + 1)
    }
    //FUNCIÓN PARA OBTENER EL TÍTULO DE CADA TAB
    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }
    //FUNCIÓN QUE RETORNA UN NÚMERO SEGÚN LOS FRAGMENTS QUE QUERAMOS QUE SE MUESTREN, EN ESTE CASO 3
    override fun getCount(): Int {

        return 3
    }
}