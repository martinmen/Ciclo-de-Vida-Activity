package com.example.ciclosdevidaactivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"onStart Activity 2",Toast.LENGTH_LONG).show()

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"onResume Activity 2",Toast.LENGTH_LONG).show()

    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"onPause Activity 2",Toast.LENGTH_LONG).show()


    }

    override fun onPostResume() {
        super.onPostResume()
        Toast.makeText(this,"onPostResume Activity 2",Toast.LENGTH_LONG).show()

    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"onStop Activity 2",Toast.LENGTH_LONG).show()

    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"onDestroy Activity 2",Toast.LENGTH_LONG).show()

    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"onRestart Activity 2",Toast.LENGTH_LONG).show()

    }

}
