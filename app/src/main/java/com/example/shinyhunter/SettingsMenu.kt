package com.example.shinyhunter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toolbar
import com.google.android.material.internal.ToolbarUtils

class SettingsMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_menu)

        val backBtn: ImageButton = findViewById (R.id.backBtn)
        backBtn.setOnClickListener { val intent = Intent( this, MainMenu::class.java)
            startActivity(intent)
        }


        val aboutBtn: TextView = findViewById(R.id.aboutBtn)
        aboutBtn.setOnClickListener{
            val intent2 = Intent(this, AboutMenu::class.java)
            startActivity(intent2)
        }

        val themeBtn: TextView = findViewById(R.id.themeBtn)
        themeBtn.setOnClickListener{
            val intent3 = Intent(this, ThemeMenu::class.java)
            startActivity(intent3)
        }

        val appVerBtn: TextView = findViewById(R.id.appVerBtn)
        appVerBtn.setOnClickListener{
            val intent4 = Intent(this, AppVersionMenu::class.java)
            startActivity(intent4)
        }
    }
}