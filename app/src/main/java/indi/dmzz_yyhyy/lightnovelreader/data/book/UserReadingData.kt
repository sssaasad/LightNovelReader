package indi.dmzz_yyhyy.lightnovelreader.data.book

import java.time.LocalDateTime

data class UserReadingData(
    val id: Int,
    val lastReadTime: LocalDateTime,
    val totalReadTime: Int,
    val readingProgress: Double,
    val lastReadChapterId: Int,
    val lastReadChapterTitle: String,
    val lastReadChapterProgress: Double
)
