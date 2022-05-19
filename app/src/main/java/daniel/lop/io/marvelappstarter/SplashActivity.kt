package daniel.lop.io.marvelappstarter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import daniel.lop.io.marvelappstarter.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private val binding: ActivitySplashBinding by lazy {
        ActivitySplashBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        setContentView(binding.root)
    }
}
