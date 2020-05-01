package csdev.it.trustedwebactivitydemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_launch_from_web.*

class LaunchFromWebActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch_from_web)
        supportActionBar.apply {
            this?.setHomeButtonEnabled(true)
            this?.setDisplayHomeAsUpEnabled(true)
        }

        handleIntent()
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        this.intent = intent
        handleIntent()
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun handleIntent() {
      intent.data?.let {
          messageTextView.text = it.getQueryParameter("message")
          sourceTextView.text = it.getQueryParameter("source")
          param3TextView.text = it.getQueryParameter("param3")
      }
    }
}
