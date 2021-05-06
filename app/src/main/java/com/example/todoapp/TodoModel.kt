package com.example.todoapp

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TodoModel (
    var title:String,
    var description:String,
    var category: String,
    var data:Long,
    var time:Long,
    var isFinished:Int = -1,
    //as we don't need to pass this parameter
    //we need to make at the end
    @PrimaryKey(autoGenerate = true)
    var id:Long = 0
)