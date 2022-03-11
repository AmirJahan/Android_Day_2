package com.oddinstitute.myseekbarapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity()
{
    // declaration
    lateinit var myLinearLayout: LinearLayout

    fun makeLayoutProgrammatic()
    {
        val tv = TextView (this)
        tv.text = "VFS"
        tv.setBackgroundColor(Color.GRAY)
        tv.setTextColor(Color.WHITE)

        val myParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                                                ViewGroup.LayoutParams.WRAP_CONTENT)

        myParams.setMargins(0, 0, 0, 20)

        tv.layoutParams = myParams

        myLinearLayout.addView(tv)
    }




    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mySeekbar = findViewById<SeekBar>(R.id.mySeekBar)
        val myTextView = findViewById<TextView>(R.id.myTextView)

        mySeekbar.max = 200
        mySeekbar.progress = 23

        mySeekbar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener
                                             {
             override fun onProgressChanged(seekbar: SeekBar?, progress: Int, p2: Boolean)
             {
                 myTextView.text = "value is: $progress"
             }

             override fun onStartTrackingTouch(p0: SeekBar?)
             {
             }

             override fun onStopTrackingTouch(p0: SeekBar?)
             {
             }

                                             })




        myLinearLayout = findViewById(R.id.myLinearLayout)

        makeLayoutProgrammatic ()
    }
}