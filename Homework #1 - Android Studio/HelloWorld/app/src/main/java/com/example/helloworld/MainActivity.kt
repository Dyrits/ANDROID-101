package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.text_view)
    }

    fun onClick(view: View) {
        val anything = findViewById<EditText>(R.id.input_text)
        val textViewText = if (anything.text.toString() != "") anything.text.toString() else "Hello World!"
        textView.text = textViewText
        Log.d("MainActivity", textViewText)
    }
}