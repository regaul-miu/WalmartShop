package com.example.walmartshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_shoping.*

class Shoping_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shoping)
        electronics.setOnClickListener {
            var intent = Intent(this,AccountRegistration::class.java)
            startActivity(intent);
        }
    }
}