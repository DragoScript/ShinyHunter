package com.example.shinyhunter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class ThemeMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_theme)

        val backBtn: ImageButton = findViewById (R.id.backBtn)
        backBtn.setOnClickListener { val intent = Intent( this, SettingsMenu::class.java)
            startActivity(intent)
        }

    }
}