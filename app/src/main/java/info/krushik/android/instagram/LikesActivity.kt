package info.krushik.android.instagram

import android.os.Bundle
import android.util.Log

class LikesActivity : BaseActivity(3) {
    private val TAG = "LikesActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        Log.d(TAG, "onCreate")
        setupBottomNavigation()
    }
}
