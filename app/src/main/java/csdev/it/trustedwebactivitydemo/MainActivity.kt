package csdev.it.trustedwebactivitydemo

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.androidbrowserhelper.trusted.TwaLauncher
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var twaLauncher: TwaLauncher

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        twaLauncher = TwaLauncher(this)

        startTwaButton.setOnClickListener { launchTwa() }
    }

    private fun launchTwa() {
        val uri = Uri.parse(CONTENT_URL)
        twaLauncher.launch(uri)
    }

    companion object{
        private const val CONTENT_URL = "https://schaeferchristian.github.io/trustedwebactivitydemo/"
    }
}
