package com.oddinstitute.navigatebetweenactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //        val loginButton = findViewById<Button>(R.id.loginButton)
        //        loginButton.setOnClickListener {
        //            // do whatever
        //        }
        //
        //        findViewById<Button>(R.id.loginButton).setOnClickListener {
        //
        //
        //        }
    }


    fun loginFun(v: View)
    {
        val intent = Intent(this, LoginActivity::class.java)

        intent.putExtra("nameKey", "VFS")


        val extras = Bundle ()

        extras.putInt("myIntKey", 12)
        extras.putString("myNameKey", "Hello")



        intent.putExtras(extras)


        startActivity(intent)
    }


}