package nmhu.edu.tourapp_bssd4250

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Gallery
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val constraintLayout = ConstraintLayout(this)
        constraintLayout.id = View.generateViewId() //view constrain id
        constraintLayout.setBackgroundColor(Color.WHITE) //change bg color

        val textView = TextView(this)
        textView.text = "Tap for address!!" //Set the text view text
        textView.setBackgroundColor(Color.WHITE) //textView stand on constraintLayout
        textView.id = View.generateViewId() //constrain id

        constraintLayout.addView(textView) // ext view layout
        setContentView(constraintLayout) //activity layout

        //Buttons to view dialog for site addresses
        val romanforumButton = Button(this)
        romanforumButton.text = "Forum"
        romanforumButton.id = View.generateViewId()
        romanforumButton.setBackgroundColor(Color.WHITE)
        romanforumButton.setOnClickListener(View.OnClickListener {
            fun showDefaultDialog() {
                val alertDialog = AlertDialog.Builder(this)
                alertDialog.apply {
                    setTitle("PVia della Salara / 5/6 00186")
                }.create().show()
            }
            showDefaultDialog() // calling the dialog
        })

        constraintLayout.addView(romanforumButton)

        val vaticanButton = Button(this)
        vaticanButton.text = "vatican"
        vaticanButton.id = View.generateViewId()
        vaticanButton.setBackgroundColor(Color.WHITE)
        vaticanButton.setOnClickListener(View.OnClickListener {
            fun showDefaultDialog() {
                val alertDialog = AlertDialog.Builder(this)
                alertDialog.apply {
                    setTitle("Pop Francis PP/ 00120")
                }.create().show()
            }
            showDefaultDialog()
        })

        constraintLayout.addView(vaticanButton)

        val CinqueButton = Button(this)
        CinqueButton.text = "Cinque"
        CinqueButton.id = View.generateViewId()
        CinqueButton.setBackgroundColor(Color.WHITE)
        CinqueButton.setOnClickListener(View.OnClickListener {
            fun showDefaultDialog() {
                val alertDialog = AlertDialog.Builder(this)
                alertDialog.apply {
                    setTitle("Province of La Spezia / 19015")
                }.create().show()
            }
            showDefaultDialog()
        })

        constraintLayout.addView(CinqueButton)

        val milanduomoButton = Button(this)
        milanduomoButton.text = "Duomo"
        milanduomoButton.id = View.generateViewId()
        milanduomoButton.setBackgroundColor(Color.WHITE)
        milanduomoButton.setOnClickListener(View.OnClickListener {
            fun showDefaultDialog() {
                val alertDialog = AlertDialog.Builder(this)
                alertDialog.apply {
                    setTitle("P.za del Duomo / I20122")
                }.create().show()
            }
            showDefaultDialog()
        })

        constraintLayout.addView(milanduomoButton)

        val lakecomoButton = Button(this)
        lakecomoButton.text = "Como"
        lakecomoButton.id = View.generateViewId()
        lakecomoButton.setBackgroundColor(Color.WHITE)
        lakecomoButton.setOnClickListener(View.OnClickListener {
            fun showDefaultDialog() {
                val alertDialog = AlertDialog.Builder(this)
                alertDialog.apply {
                    setTitle("Blevio / 22020")
                }.create().show()
            }
            showDefaultDialog()
        })
        constraintLayout.addView(lakecomoButton)

        val galleryButton = Button(this)
        galleryButton.text = "Gallery"
        galleryButton.id = View.generateViewId()
        galleryButton.setBackgroundColor(Color.WHITE)
        galleryButton.setOnClickListener(View.OnClickListener {

            // Creating a second activity and passing data to communicate with second activity
            val intent = Intent(this,GalleryActivity::class.java)
            startActivity(intent)
        })
        constraintLayout.addView(galleryButton)


        val constraintSet = ConstraintSet() //Apply multiple constraints at once with a set
        val pid = ConstraintSet.PARENT_ID //the parent id. This will save typing below
        constraintSet.constrainHeight(textView.id, ConstraintSet.WRAP_CONTENT) //Wrap only text
        constraintSet.constrainWidth(textView.id, ConstraintSet.WRAP_CONTENT) //Wrap only text

        constraintSet.constrainHeight(romanforumButton.id, ConstraintSet.WRAP_CONTENT)
        constraintSet.constrainWidth(romanforumButton.id, ConstraintSet.WRAP_CONTENT)

        constraintSet.constrainHeight(vaticanButton.id, ConstraintSet.WRAP_CONTENT)
        constraintSet.constrainWidth(vaticanButton.id, ConstraintSet.WRAP_CONTENT)

        constraintSet.constrainHeight(CinqueButton.id, ConstraintSet.WRAP_CONTENT)
        constraintSet.constrainWidth(CinqueButton.id, ConstraintSet.WRAP_CONTENT)

        constraintSet.constrainHeight(milanduomoButton.id, ConstraintSet.WRAP_CONTENT)
        constraintSet.constrainWidth(milanduomoButton.id, ConstraintSet.WRAP_CONTENT)

        constraintSet.constrainHeight(lakecomoButton.id, ConstraintSet.WRAP_CONTENT)
        constraintSet.constrainWidth(lakecomoButton.id, ConstraintSet.WRAP_CONTENT)

        constraintSet.constrainHeight(galleryButton.id, ConstraintSet.WRAP_CONTENT)
        constraintSet.constrainWidth(galleryButton.id, ConstraintSet.WRAP_CONTENT)

        //Match bottom, top, left, right. equal tension between all places textView in center

        constraintSet.connect(textView.id, ConstraintSet.BOTTOM, pid, ConstraintSet.BOTTOM)
        constraintSet.connect(textView.id, ConstraintSet.TOP, pid, ConstraintSet.TOP)
        constraintSet.connect(textView.id, ConstraintSet.LEFT, pid, ConstraintSet.LEFT)
        constraintSet.connect(textView.id, ConstraintSet.RIGHT, pid, ConstraintSet.RIGHT)

        constraintSet.connect(romanforumButton.id, ConstraintSet.LEFT, pid, ConstraintSet.LEFT)
        constraintSet.connect(romanforumButton.id, ConstraintSet.RIGHT, pid, ConstraintSet.RIGHT)
        constraintSet.connect(romanforumButton.id, ConstraintSet.TOP, textView.id, ConstraintSet.BOTTOM)

        constraintSet.connect(vaticanButton.id, ConstraintSet.LEFT, pid, ConstraintSet.LEFT)
        constraintSet.connect(vaticanButton.id, ConstraintSet.RIGHT, pid, ConstraintSet.RIGHT)
        constraintSet.connect(vaticanButton.id, ConstraintSet.TOP, romanforumButton.id, ConstraintSet.BOTTOM)

        constraintSet.connect(CinqueButton.id, ConstraintSet.LEFT, pid, ConstraintSet.LEFT)
        constraintSet.connect(CinqueButton.id, ConstraintSet.RIGHT, pid, ConstraintSet.RIGHT)
        constraintSet.connect(CinqueButton.id, ConstraintSet.TOP, vaticanButton.id, ConstraintSet.BOTTOM)

        constraintSet.connect(milanduomoButton.id, ConstraintSet.LEFT, pid, ConstraintSet.LEFT)
        constraintSet.connect(milanduomoButton.id, ConstraintSet.RIGHT, pid, ConstraintSet.RIGHT)
        constraintSet.connect(milanduomoButton.id, ConstraintSet.TOP, CinqueButton.id, ConstraintSet.BOTTOM)

        constraintSet.connect(lakecomoButton.id, ConstraintSet.LEFT, pid, ConstraintSet.LEFT)
        constraintSet.connect(lakecomoButton.id, ConstraintSet.RIGHT, pid, ConstraintSet.RIGHT)
        constraintSet.connect(lakecomoButton.id, ConstraintSet.TOP, milanduomoButton.id, ConstraintSet.BOTTOM)

        constraintSet.connect(galleryButton.id, ConstraintSet.LEFT, pid, ConstraintSet.LEFT)
        constraintSet.connect(galleryButton.id, ConstraintSet.RIGHT, pid, ConstraintSet.RIGHT)
        constraintSet.connect(galleryButton.id, ConstraintSet.TOP, lakecomoButton.id, ConstraintSet.BOTTOM)

        constraintSet.applyTo(constraintLayout) //apply this to the Layout container


    }
}