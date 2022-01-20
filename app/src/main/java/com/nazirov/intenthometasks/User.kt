package com.nazirov.intenthometasks

import java.io.Serializable

class User(val id: Int, val name: String) : Serializable {

    override fun toString(): String {
        return " $id + : + $name"

    }

}