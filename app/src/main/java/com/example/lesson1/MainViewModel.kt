package com.example.lesson1

import androidx.lifecycle.*

 class MainViewModel : ViewModel() {
     private var mCounter = 0
     val counter = MutableLiveData<Int>()
     val result = MutableLiveData<ArrayList<String>>()
<<<<<<< HEAD
     var list: ArrayList<String> = ArrayList()
=======
     private var list: ArrayList<String> = ArrayList()
>>>>>>> bd9a758 (1.1)

     fun onIncrementClick() {
         mCounter++
         list.add("+")
         result.value = list
         counter.value = mCounter
         println(result.toString())
     }

     fun onDecrementClick() {
         mCounter--
         list.add("-")
         result.value = list
         println(result.value.toString())
         counter.value = mCounter
     }


 }