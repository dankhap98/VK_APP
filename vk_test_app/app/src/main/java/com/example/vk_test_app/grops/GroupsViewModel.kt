package com.example.vk_test_app.grops

import androidx.lifecycle.ViewModel
import com.example.vk_test_app.database.GropusDataDao
class GroupsViewModel(dataSource: GropusDataDao) : ViewModel() {

    public val nights = dataSource.getAllGroups()


}