package com.example.vk_test_app.grops

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.vk_test_app.database.GropusDataDao

class GroupsViewModelFactory(private val dataSource: GropusDataDao) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(GroupsViewModel::class.java))
            return GroupsViewModel(dataSource) as T
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}