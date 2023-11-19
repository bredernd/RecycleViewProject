package com.example.recycleviewproject

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _selectedTitle = MutableLiveData<String>()
    val selectedTitle: LiveData<String> = _selectedTitle

    private val _selectedDetail = MutableLiveData<String>()
    val selectedDetail: LiveData<String> = _selectedDetail

    private val _selectedImageResId = MutableLiveData<Int>()
    val selectedImageResId: LiveData<Int> = _selectedImageResId

    fun setSelectedItem(title: String, detail: String, imageResId: Int) {
        _selectedTitle.value = title
        _selectedDetail.value = detail
        _selectedImageResId.value = imageResId
    }
}

