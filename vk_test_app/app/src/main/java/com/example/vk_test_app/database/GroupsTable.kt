package com.example.vk_test_app.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "unsubscribed_data")
data class GroupsTable(
    @PrimaryKey(autoGenerate = true)
    var id : Int = 0){
}
