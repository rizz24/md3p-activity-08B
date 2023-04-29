package com.android.activity08b

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.CheckBox
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner: Spinner = findViewById(R.id.monthS)
        val spinner2: Spinner = findViewById(R.id.yearS)
        val spinner3: Spinner = findViewById(R.id.dayS)

        ArrayAdapter.createFromResource(
            this,
            R.array.month,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter

            val spinner: Spinner = findViewById(R.id.monthS)
            spinner.onItemSelectedListener = this
        }

        ArrayAdapter.createFromResource(
            this,
            R.array.day,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner2.adapter = adapter

            val spinner: Spinner = findViewById(R.id.dayS)
            spinner.onItemSelectedListener = this
        }

        ArrayAdapter.createFromResource(
            this,
            R.array.year,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner3.adapter = adapter

            val spinner: Spinner = findViewById(R.id.yearS)
            spinner.onItemSelectedListener = this

            val chk = findViewById<CheckBox>(R.id.day)
            val chk2 = findViewById<CheckBox>(R.id.night)
            val chk3 = findViewById<CheckBox>(R.id.coke)
            val chk4 = findViewById<CheckBox>(R.id.pepsi)
        }
    }

        override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
        }

        override fun onNothingSelected(parent: AdapterView<*>) {
            // Another interface callback
        }

    }