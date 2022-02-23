package com.sabsrocambole.swoosh2

import android.content.Intent
import android.os.Bundle
import android.service.controls.templates.ControlButton
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val getStartedButton = findViewById<Button>(R.id.getStartedBtn)
        getStartedButton.setOnClickListener {
            val leagueIntent = Intent(this, activity_league::class.java )
            startActivity(leagueIntent)
        }


    }
}