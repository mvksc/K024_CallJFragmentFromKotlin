package m.vk.k024_calljfragmentfromkotlin

import android.app.Application

class MainApplication : Application(){
    override fun onCreate() {
        super.onCreate()
    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)
    }
}