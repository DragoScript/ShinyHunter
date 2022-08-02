package com.example.shinyhunter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toolbar
import com.google.android.material.internal.ToolbarUtils

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_menu)

        val settingsBtn: ImageButton = findViewById (R.id.settingsBtn)
        settingsBtn.setOnClickListener {
            val intent = Intent( this, SettingsMenu::class.java)
            startActivity(intent)
        }
    }
}