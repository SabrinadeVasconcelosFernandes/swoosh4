package com.sabsrocambole.swoosh2.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.sabsrocambole.swoosh2.EXTRA_LEAGUE
import com.sabsrocambole.swoosh2.EXTRA_SKILL
import com.sabsrocambole.swoosh4.R
import org.w3c.dom.Text
import java.time.format.TextStyle

class FinishActivity : AppCompatActivity() {

    var searchLeaguesText = findViewById<TextView>(R.id.searchLeaguesText)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.text = "Looking for $league $skill near you"
    }
}