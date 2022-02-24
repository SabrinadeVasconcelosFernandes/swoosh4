package com.sabsrocambole.swoosh2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.ToggleButton
import com.sabsrocambole.swoosh4.R

class activity_league : BaseActivity() {

    var selectedLeague = ""
//val getStartedButton = findViewById<Button>(R.id.getStartedBtn)
    val womensLeagueBtn = findViewById<ToggleButton>(R.id.womensLeagueBtn)
    val mensLeagueBtn = findViewById<ToggleButton>(R.id.mensLeagueBtn)
    val coedLeagueBtn = findViewById<ToggleButton>(R.id.coedLeagueBtn)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view:View){
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        selectedLeague = "mens"
    }

    fun onWomensClicked(view:View){
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        selectedLeague = "womens"
    }

    fun onCoedClicked(view:View){
        womensLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false
        selectedLeague = "Co-ed"
    }

    fun leagueNextCliqued(view:View){
        if(selectedLeague!=""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE,selectedLeague)
            startActivity(skillActivity)
        }
        else{
            Toast.makeText(this,"Please select a league.",Toast.LENGTH_SHORT).show()
        }

    }

}