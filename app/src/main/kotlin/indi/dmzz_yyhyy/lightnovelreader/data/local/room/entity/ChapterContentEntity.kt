package indi.dmzz_yyhyy.lightnovelreader.data.local.room.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "chapter_content")
data class ChapterContentEntity(
    @PrimaryKey
    val id: Int,
    val title: String,
    val content: String,
    val lastChapter: Int,
    val nextChapter: Int
)
