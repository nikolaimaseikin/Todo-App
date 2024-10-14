package com.example.todoapp.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface TaskDao {
    @Query("SELECT * FROM tasks ORDER BY deadline ASC")
    suspend fun getAllTasks(): List<TaskEntity>

    //Создать задачу. В случае конфликта перезаписать
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTask(task: TaskEntity)

    //Обновить задачу
    @Update
    suspend fun updateTask(task: TaskEntity)

    //Удалить задачу по объекту
    @Delete
    suspend fun deleteTask(task: TaskEntity)

    //Удалить задачу по id
    @Query("DELETE FROM tasks WHERE id = :taskId")
    suspend fun deleteTask(taskId: Int)

    //Получить задачу по id
    @Query("SELECT * FROM tasks WHERE id = :taskId")
    suspend fun getTaskById(taskId: Int): TaskEntity?

    //Получить задачи по важности, отсортированные по дедлайну
    @Query("SELECT * FROM tasks WHERE importance = :importance ORDER BY deadline ASC")
    suspend fun getTasksByImportance(importance: Importance): List<TaskEntity>
}