package com.example.test_mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val fullNameMutableLive = MutableLiveData<String>()
    val fullNameLive: LiveData<String> = fullNameMutableLive

    fun setFullName(firstName: String, lastName: String)
    {
        fullNameMutableLive.value = "$firstName $lastName"
    }
}