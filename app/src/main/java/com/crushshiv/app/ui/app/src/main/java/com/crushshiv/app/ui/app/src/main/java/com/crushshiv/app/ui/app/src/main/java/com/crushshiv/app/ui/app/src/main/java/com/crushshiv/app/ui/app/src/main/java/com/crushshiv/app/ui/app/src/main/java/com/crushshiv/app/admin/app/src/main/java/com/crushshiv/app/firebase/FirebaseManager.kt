package com.crushshiv.app.firebase

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

object FirebaseManager {

    val auth: FirebaseAuth by lazy {
        FirebaseAuth.getInstance()
    }

    val database: FirebaseFirestore by lazy {
        FirebaseFirestore.getInstance()
    }


    fun isUserLoggedIn(): Boolean {
        return auth.currentUser != null
    }


    fun logout() {
        auth.signOut()
    }
}
