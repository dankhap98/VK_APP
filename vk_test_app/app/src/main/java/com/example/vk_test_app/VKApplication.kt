package com.example.vk_test_app

import android.app.Application
import android.util.Log
import com.vk.api.sdk.VK
import com.vk.api.sdk.VKTokenExpiredHandler
import com.vk.api.sdk.utils.VKUtils
import com.vk.api.sdk.utils.VKUtils.getCertificateFingerprint


open class VKApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        val fingerprints = getCertificateFingerprint(this, this.packageName)
        fingerprints?.get(0)?.let { Log.e("TAAG", it.toString()) }
        VK.addTokenExpiredHandler(tokenTracker)
    }

    private val tokenTracker = object: VKTokenExpiredHandler {
        override fun onTokenExpired() {
            Log.e("TAGG", "here1")
        }
    }
}