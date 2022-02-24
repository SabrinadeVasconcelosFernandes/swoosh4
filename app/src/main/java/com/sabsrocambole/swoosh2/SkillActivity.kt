package com.sabsrocambole.swoosh2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sabsrocambole.swoosh4.R

class SkillActivity : BaseActivity() {

    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        println(league)
    }
}