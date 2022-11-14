package com.example.criminalintent

import android.icu.text.CaseMap.Title
import java.util.UUID

data class Crime(var id: UUID = UUID.randomUUID())
{
    val requiresPolice: Any
    var title:String = ""
    var date: Int = 0
    var isSolved: Boolean = false
    constructor(id:UUID, title:String, date:Int, isSolved:Boolean) : this() {
        this.id = id
        this.title = title
        this.date = date
        this.isSolved = isSolved
    }
}
