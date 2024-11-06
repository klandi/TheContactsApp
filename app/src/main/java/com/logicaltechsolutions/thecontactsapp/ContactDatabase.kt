package com.logicaltechsolutions.thecontactsapp

import androidx.room.Database
import androidx.room.RoomDatabase

/*
The "database" is where we initialize the "Room" database
 */
@Database(entities = [Contact::class], version = 1, exportSchema = false)
abstract class ContactDatabase: RoomDatabase() {
    abstract fun ContactDao(): ContactDao
}