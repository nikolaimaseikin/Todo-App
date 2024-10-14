package com.example.todoapp.data.repository

interface TaskReposirory {
    suspend fun getAllTasks(): List<Task>
    suspend fun deleteTask(task: Task)
    suspend fun updateTask(task: Task)
    suspend fun insertTask(task: Task)
    suspend fun getTaskById(taskId: Int): Task?
    suspend fun getTasksByImportance(importance: Importance): List<Task>
}