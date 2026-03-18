package com.example.grade_clicker.data

import com.example.grade_clicker.R
import com.example.grade_clicker.model.Grade

class Datasource {
    fun loadGrades(): List<Grade> {
        return listOf(
            Grade(R.drawable.grade_0, 5, 0),
            Grade(R.drawable.grade_50, 5, 50),
            Grade(R.drawable.grade_70, 5, 70),
            Grade(R.drawable.grade_90, 5, 90),
            Grade(R.drawable.grade_100, 5, 100)
        )
    }
}