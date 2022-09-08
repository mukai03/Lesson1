package com.example.lesson1

import androidx.lifecycle.*

 class MainViewModel : ViewModel() {
     private var mCounter = 0
     val counter = MutableLiveData<Int>()
     val result = MutableLiveData<ArrayList<String>>()
     var list: ArrayList<String> = ArrayList()

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