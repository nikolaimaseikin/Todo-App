package com.example.todoapp.data.repository

import com.example.todoapp.data.db.Importance

data class Task(
    val id: Int,
    val title: String,
    val description: String?,
    val deadline: Long, //Unix-time
    val importance: Importance
)
