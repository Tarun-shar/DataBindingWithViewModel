package com.example.databindingwithlivedataviewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelDataBinding: ViewModel() {

    var nameLiveData = MutableLiveData<String>("Tarun Sharma")

    fun updateLiveData(){
        nameLiveData.value = "Android App Developer"
    }
}