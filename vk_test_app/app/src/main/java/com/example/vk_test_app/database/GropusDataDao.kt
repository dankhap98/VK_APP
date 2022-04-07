package com.example.vk_test_app.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface GropusDataDao {

    @Insert
    fun insert(group: GroupsTable)

    @Update
    fun update(group: GroupsTable)

    @Query("SELECT * FROM `unsubscribed_data` WHERE `id` =  :key")
    fun get(key: Int): GroupsTable?

    @Query("DELETE FROM unsubscribed_data")
    fun clear()

    @Query("SELECT * FROM unsubscribed_data ORDER BY id DESC")
    fun getAllGroups(): LiveData<List<GroupsTable>>

}