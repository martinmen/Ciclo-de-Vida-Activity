package com.example.ciclosdevidaactivity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
Toast.makeText(this,"onCreate",Toast.LENGTH_LONG).show()

        button1.setOnClickListener { val intent= Intent(this,Main2Activity::class.java)
        startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"onStart Activity 1",Toast.LENGTH_LONG).show()

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"onResume Activity 1",Toast.LENGTH_LONG).show()

    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"onPause Activity 1",Toast.LENGTH_LONG).show()


    }

    override fun onPostResume() {
        super.onPostResume()
        Toast.makeText(this,"onPostResume Activity 1",Toast.LENGTH_LONG).show()

    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"onStop Activity 1",Toast.LENGTH_LONG).show()

    }

    override fun onDestroy() {
         super.onDestroy()
       Toast.makeText(this,"onDestroy Activity 1",Toast.LENGTH_LONG).show()

    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"onRestart Activity 1",Toast.LENGTH_LONG).show()

    }
}
