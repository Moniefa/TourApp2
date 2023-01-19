package com.robotemi.sdk.sample


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity()//, AdapterView.OnItemSelectedListener
{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val languages = arrayOf("English", "Spanish", "French", "German")

        //val locations = resources.getStringArray(R.array.Locations)

        val spinner : Spinner = findViewById(R.id.spinner)

        if (spinner != null) {
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, languages)
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter;

            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                    Toast.makeText(this@MainActivity,
                        getString(R.string.selected_item) + " " +
                                "" + languages[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }
    }

    fun onGoFunction(view: View) {
        Log.d("GO to Location", "Test")
    }
//    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//        Toast.makeText(this@LocationActivity2,
//            getString(R.string.selected_item) + " " +
//                    "" + locations[position], Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onNothingSelected(parent: AdapterView<*>?) {
//        TODO("Not yet implemented")
//    }
}