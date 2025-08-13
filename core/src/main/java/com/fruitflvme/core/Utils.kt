package com.fruitflvme.core

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale

object Utils {
    private val imageMap = mapOf(
        100 to R.drawable.a,
        101 to R.drawable.b,
        102 to R.drawable.c,
    )

    fun getResId(name: Int) = imageMap[name] ?: R.drawable.d

    fun formatDate(dateString: String): String {
        val date = LocalDate.parse(dateString)
        val formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale("ru"))
        return date.format(formatter)
    }

}