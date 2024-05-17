package com.azruddin.icetask3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.EditText
import androidx.core.widget.TextViewCompat

class MainActivity() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editTextMinutes = findViewById<EditText>(R.id.editTextMinutes)
        val buttonCalculate = findViewById<Button>(R.id.buttonCalculate)
        val textViewResult = findViewById<TextViewCompat>(R.id.textViewResult)

        buttonCalculate.setOnClickListener {
            val minutes = editTextMinutes.text.toString().toIntOrNull()

            if (minutes != null && minutes > 0) {
                val hours = minutes / 60
                val remainingMinutes = minutes % 60
                val rentalCost = (hours * 400) + remainingMinutes

                textViewResult.text =
                    "Hours: $hours\nMinutes: $remainingMinutes\nTotal price: R$rentalCost"
            } else {
                textViewResult.text = "Invalid input"
            }
        }
    }
}