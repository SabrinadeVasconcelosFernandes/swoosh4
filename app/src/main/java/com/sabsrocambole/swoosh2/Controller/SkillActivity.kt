package com.sabsrocambole.swoosh2.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.ToggleButton
import com.sabsrocambole.swoosh2.EXTRA_LEAGUE
import com.sabsrocambole.swoosh2.EXTRA_SKILL
import com.sabsrocambole.swoosh4.R

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    var beginnerSkillBtn = findViewById<ToggleButton>(R.id.beginnerSkillBtn)
    var ballerSkillBtn = findViewById<ToggleButton>(R.id.ballerSkillBtn)
    var skillFinishBtn = findViewById<Button>(R.id.skillFinishBtn)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        //println(league)
    }


    fun onBallerClick(view:View){
        beginnerSkillBtn.isChecked = false
        skill = "Baller"
    }

    fun onBeginnerClick(view:View){
        ballerSkillBtn.isChecked = false
        skill = "Beginner"
    }


    fun onSkillFinishClicked(view:View){
        if (skill != ""){
            val finishActivity = Intent(this,FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE,league)
            finishActivity.putExtra(EXTRA_SKILL,skill)
            startActivity(finishActivity)
        }
        else{
            Toast.makeText(this,"Please select a skill level", Toast.LENGTH_SHORT).show()
        }

    }
}