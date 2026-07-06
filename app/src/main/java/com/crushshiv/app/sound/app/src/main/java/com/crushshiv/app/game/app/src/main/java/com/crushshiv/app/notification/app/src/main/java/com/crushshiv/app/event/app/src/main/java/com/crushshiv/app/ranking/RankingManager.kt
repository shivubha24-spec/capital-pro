package com.crushshiv.app.ranking

data class RankPlayer(
    val name: String,
    val score: Int,
    val level: Int
)


class RankingManager {

    private val players = mutableListOf<RankPlayer>()


    fun addPlayer(player: RankPlayer) {
        players.add(player)
    }


    fun getLeaderboard(): List<RankPlayer> {

        return players.sortedByDescending {
            it.score
        }
    }


    fun getPlayerRank(name: String): Int {

        val leaderboard = getLeaderboard()

        val position = leaderboard.indexOfFirst {
            it.name == name
        }

        return if (position >= 0) {
            position + 1
        } else {
            -1
        }
    }


    fun clearRanking() {
        players.clear()
    }
}
