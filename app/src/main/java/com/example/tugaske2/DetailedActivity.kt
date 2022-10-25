package com.example.tugaske2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailedActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog)

        val data = intent.getParcelableExtra<DataModel>("datax")
        if (data != null){
            val profile: ImageView = findViewById(R.id.profile)
            val textName: TextView = findViewById(R.id.txt_name)
            val textNim: TextView = findViewById(R.id.txt_nim)

            profile.setImageResource(data.imgView)
            textName.text = data.txtTitle
            textNim.text = data.txtDesc
        }
    }
}