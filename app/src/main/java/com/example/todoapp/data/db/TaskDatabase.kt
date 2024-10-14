package com.example.todoapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [TaskEntity::class], version = 1)
@TypeConverters(Converters::class)
abstract class TaskDatabase: RoomDatabase() {
    abstract fun taskDao(): TaskDao
}