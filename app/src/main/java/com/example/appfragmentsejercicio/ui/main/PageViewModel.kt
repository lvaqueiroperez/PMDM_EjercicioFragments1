package com.example.appfragmentsejercicio.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class PageViewModel : ViewModel() {

    private val _index = MutableLiveData<Int>()
    val text: LiveData<String> = Transformations.map(_index) {
        //CAMBIAMOS EL TEXTO DEL LABEL QUE TIENE CADA TAB, NO EL NOMBRE DE LA TAB !!! (CÓMO???)
        //PARA CAMBIAR EL NOMBRE DE LAS TABS IR AL FICHERO STRINGS
        "Contactos (?)"
    }

    fun setIndex(index: Int) {
        _index.value = index
    }
}