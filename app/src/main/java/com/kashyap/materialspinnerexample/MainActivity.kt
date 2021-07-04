package com.kashyap.materialspinnerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val languages = resources.getStringArray(R.array.coding_languages)
        val autoCompleteTextView = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)


        //Creating an arrayAdapter

        val adapter =
            ArrayAdapter(applicationContext, R.layout.item_drop_down, R.id.text_view, languages)
        //attach the adapter to AutoCompleteTextview

        autoCompleteTextView.setAdapter(adapter)

        //now we don't want keypad then set inputType as none.



    }
}