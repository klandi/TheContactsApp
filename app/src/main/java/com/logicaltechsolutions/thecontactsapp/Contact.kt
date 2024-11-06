package com.logicaltechsolutions.thecontactsapp

import androidx.room.Entity
import androidx.room.PrimaryKey

/*
This is the "Entity" which means it is the structure of the "data"
 */
@Entity(tableName = "contacts")
data class Contact(
    @PrimaryKey(autoGenerate = true)val id: Int,
    val image: String,
    val name: String,
    val phoneNumber: String,
    val email: String
)


