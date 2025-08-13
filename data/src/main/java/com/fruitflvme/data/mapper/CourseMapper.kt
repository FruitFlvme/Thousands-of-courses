package com.fruitflvme.data.mapper

import com.fruitflvme.data.database.entity.CourseEntity
import com.fruitflvme.data.network.dto.CourseDto
import com.fruitflvme.domain.model.Course

fun Course.toEntity(): CourseEntity {
    return CourseEntity(
        id, title, text, price, rate, startDate, hasLike, publishDate
    )
}

fun CourseEntity.toDomain(): Course {
    return Course(
        id, title, text, price, rate, startDate, hasLike, publishDate
    )
}

fun Course.toDto(): CourseDto {
    return CourseDto(
        id, title, text, price, rate, startDate, hasLike, publishDate
    )
}

fun CourseDto.toDomain(): Course {
    return Course(
        id, title, text, price, rate, startDate, hasLike, publishDate
    )
}