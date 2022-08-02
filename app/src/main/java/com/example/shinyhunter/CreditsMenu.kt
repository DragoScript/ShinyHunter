package com.example.shinyhunter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toolbar
import com.google.android.material.internal.ToolbarUtils

class CreditsMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_about_credits)

        val backBtn: ImageButton = findViewById (R.id.backBtn)
        backBtn.setOnClickListener { val intent = Intent( this, AboutMenu::class.java)
            startActivity(intent)
        }
    }
}