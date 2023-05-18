package com.example.recyclerview_gridview_style_kotlin.model

class Member(var profile: Int, var firstName: String, var lestName: String){

    fun getProfilee(): Int {
        return profile
    }

    fun setProfilee(profile: Int) {
        this.profile = profile
    }

    fun getFirstNamee(): String? {
        return firstName
    }

    fun getLestNamee(): String? {
        return lestName
    }

    fun setFirstNamee(firstName: String) {
        this.firstName = firstName
    }

    fun setLestNamee(lestName: String) {
        this.lestName = lestName
    }


}


