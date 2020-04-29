package csdev.it.trustedwebactivitydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startTwaButton.setOnClickListener { launchTwa() }
    }

    private fun launchTwa() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
