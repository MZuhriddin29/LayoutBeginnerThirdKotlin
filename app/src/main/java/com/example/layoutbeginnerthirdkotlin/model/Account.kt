package com.example.layoutbeginnerthirdkotlin.model

import android.os.Parcelable
import java.io.Serializable

class Account : Serializable {

    var userID = ""
    var password_ = ""

    constructor(userId: String, password: String) {
        userID = userId
        password_ = password
    }


}