package com.example.vk_test_app.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [GroupsTable::class], version = 1, exportSchema = false)
abstract class groupsDataBase : RoomDatabase() {
    abstract val gropusDataDao: GropusDataDao

    companion object{
        @Volatile
        private var INSTANCE: groupsDataBase? = null

        fun  getInstance(context: Context) : groupsDataBase {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        groupsDataBase::class.java,
                        "unsub_groups_base"
                    ).fallbackToDestructiveMigration().build()
                    INSTANCE = instance

                }
                return instance
            }
        }
    }
}