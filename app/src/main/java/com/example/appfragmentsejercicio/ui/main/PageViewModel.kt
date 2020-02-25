package com.example.appfragmentsejercicio.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

//CLASE USADA PARA EL "PageViewModel"
class PageViewModel : ViewModel() {
    //VARIABLES "LiveData" DONDE ALMACENAREMOS EL TIPO DE DATO QUE SE MOSTRARÁ EN LOS FRAGMENTS
    private val _index = MutableLiveData<Int>()
    val text: LiveData<String> = Transformations.map(_index) {
        //COMO USAMOS EL MISMO FRAGMENT PARA CADA TAB, TODOS TENDRÁN LOS MISMOS O MUY PARECIDOS CONTENIDOS

        "Ejemplo"
    }
//FUNCIÓN PARA PONER Y MOSTRAR UN INDEX DISTINTO EN CADA FRAGMENT SI QUEREMOS
    fun setIndex(index: Int) {
        _index.value = index
    }
}