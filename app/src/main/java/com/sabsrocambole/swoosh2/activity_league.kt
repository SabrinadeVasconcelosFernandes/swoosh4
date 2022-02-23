package com.sabsrocambole.swoosh2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sabsrocambole.swoosh4.R

class activity_league : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }
    fun leagueNextCliqued(view:View){
        val skillActivity = Intent(this, SkillActivity::class.java)
        startActivity(skillActivity)
    }

}