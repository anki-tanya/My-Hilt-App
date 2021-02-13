package com.example.recyclerview.myhiltapp

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class MyViewModel @Inject constructor(
   @Named("Str2")  RandomStr2 : String
) : ViewModel() {

    init {
        Log.d("MyViewModel", "Random string from ViewModel $RandomStr2")
    }
}