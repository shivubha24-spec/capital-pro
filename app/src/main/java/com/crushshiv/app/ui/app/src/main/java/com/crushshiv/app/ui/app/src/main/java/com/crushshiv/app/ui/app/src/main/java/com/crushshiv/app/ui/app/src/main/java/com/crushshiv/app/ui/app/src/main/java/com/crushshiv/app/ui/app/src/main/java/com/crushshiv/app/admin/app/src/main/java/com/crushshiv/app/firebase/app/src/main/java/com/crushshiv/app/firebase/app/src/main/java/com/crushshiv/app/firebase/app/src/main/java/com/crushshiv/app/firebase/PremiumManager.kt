package com.crushshiv.app.firebase

import com.google.firebase.firestore.FirebaseFirestore

class PremiumManager {

    private val db = FirebaseFirestore.getInstance()


    fun activatePremium(
        userId: String,
        onComplete: (Boolean) -> Unit
    ) {

        val data = hashMapOf(
            "premium" to true,
            "premiumType" to "VIP",
            "activatedAt" to System.currentTimeMillis()
        )

        db.collection("players")
            .document(userId)
            .update(data as Map<String, Any>)
            .addOnSuccessListener {
                onComplete(true)
            }
            .addOnFailureListener {
                onComplete(false)
            }
    }


    fun checkPremium(
        userId: String,
        onResult: (Boolean) -> Unit
    ) {

        db.collection("players")
            .document(userId)
            .get()
            .addOnSuccessListener { document ->

                val status =
                    document.getBoolean("premium") ?: false

                onResult(status)
            }
            .addOnFailureListener {
                onResult(false)
            }
    }
}
