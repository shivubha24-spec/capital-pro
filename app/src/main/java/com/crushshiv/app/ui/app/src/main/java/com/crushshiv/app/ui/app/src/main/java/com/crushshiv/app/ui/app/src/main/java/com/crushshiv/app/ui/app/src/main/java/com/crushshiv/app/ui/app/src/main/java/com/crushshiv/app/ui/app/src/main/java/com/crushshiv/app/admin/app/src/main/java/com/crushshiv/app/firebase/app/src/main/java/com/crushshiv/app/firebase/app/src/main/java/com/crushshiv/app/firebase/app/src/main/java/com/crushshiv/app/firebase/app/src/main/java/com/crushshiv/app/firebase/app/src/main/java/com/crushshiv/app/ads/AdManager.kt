package com.crushshiv.app.ads

class AdManager {

    private var adsEnabled = true


    fun showBannerAd() {
        if (adsEnabled) {
            println("Showing Banner Ad")
        }
    }


    fun showInterstitialAd() {
        if (adsEnabled) {
            println("Showing Full Screen Ad")
        }
    }


    fun showRewardAd(
        onReward: () -> Unit
    ) {

        if (adsEnabled) {

            println("Watching Reward Ad")

            // Reward after ad complete
            onReward()
        }
    }


    fun removeAds() {
        adsEnabled = false
    }


    fun areAdsEnabled(): Boolean {
        return adsEnabled
    }
}
