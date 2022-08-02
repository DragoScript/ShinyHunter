package com.example.shinyhunter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toolbar
import com.google.android.material.internal.ToolbarUtils

class AboutMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_about)

        val backBtn: ImageButton = findViewById (R.id.backBtn)
        backBtn.setOnClickListener { val intent = Intent( this, SettingsMenu::class.java)
            startActivity(intent)
        }

        val creditBtn: TextView = findViewById(R.id.creditsBtn)
        creditBtn.setOnClickListener{
            val intent2 = Intent(this, CreditsMenu::class.java)
            startActivity(intent2)
        }

    }
}