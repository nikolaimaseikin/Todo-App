package com.example.todoapp.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.todoapp.data.repository.Importance

@Entity(tableName = "tasks")
data class TaskEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val description: String? = null,
    val deadline: Long? = null, //Unix-time
    val importance: Importance = Importance.MEDIUM //По-умолчанию средняя важность
)
