package nmhu.edu.tourapp_bssd4250

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GalleryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Action bar for returning to main activity
        val actionBar = supportActionBar
        actionBar!!.title = "Tour Italy Gallery"
        actionBar.setDisplayHomeAsUpEnabled(true)

        // second activity passing data to first activity (main)
        val galleryActivityButton = Button(this)
        galleryActivityButton.setOnClickListener{
            val intent = Intent(this,GalleryActivity::class.java)
            startActivity(intent)
        }
    }
}