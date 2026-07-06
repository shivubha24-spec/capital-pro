package com.crushshiv.app.firebase

import com.google.firebase.firestore.FirebaseFirestore
import com.crushshiv.app.data.PlayerData

class UserRepository {

    private val db = FirebaseFirestore.getInstance()

    fun savePlayerData(
        userId: String,
        playerData: PlayerData,
        onComplete: (Boolean) -> Unit
    ) {

        db.collection("players")
            .document(userId)
            .set(playerData)
            .addOnSuccessListener {
                onComplete(true)
            }
            .addOnFailureListener {
                onComplete(false)
            }
    }


    fun getPlayerData(
        userId: String,
        onResult: (PlayerData?) -> Unit
    ) {

        db.collection("players")
            .document(userId)
            .get()
            .addOnSuccessListener { document ->

                val data =
                    document.toObject(PlayerData::class.java)

                onResult(data)
            }
            .addOnFailureListener {
                onResult(null)
            }
    }
}
