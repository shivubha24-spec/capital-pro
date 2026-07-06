package com.crushshiv.app.firebase

import com.google.firebase.firestore.FirebaseFirestore

class LevelManagerFirebase {

    private val db = FirebaseFirestore.getInstance()


    fun saveLevelProgress(
        userId: String,
        level: Int,
        score: Int,
        stars: Int,
        onComplete: (Boolean) -> Unit
    ) {

        val data = hashMapOf(
            "level" to level,
            "score" to score,
            "stars" to stars
        )

        db.collection("players")
            .document(userId)
            .collection("progress")
            .document("game")
            .set(data)
            .addOnSuccessListener {
                onComplete(true)
            }
            .addOnFailureListener {
                onComplete(false)
            }
    }


    fun getLevelProgress(
        userId: String,
        onResult: (Int, Int, Int) -> Unit
    ) {

        db.collection("players")
            .document(userId)
            .collection("progress")
            .document("game")
            .get()
            .addOnSuccessListener { document ->

                val level =
                    document.getLong("level")?.toInt() ?: 1

                val score =
                    document.getLong("score")?.toInt() ?: 0

                val stars =
                    document.getLong("stars")?.toInt() ?: 0

                onResult(level, score, stars)
            }
    }
}
