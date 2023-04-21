package com.practicum.playlistmaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val searchButton = findViewById<Button>(R.id.search_b)
        val mediaButton = findViewById<Button>(R.id.media_b)
        val settingsButton = findViewById<Button>(R.id.settings_b)

        searchButton.setOnClickListener {
            val searchButtonIntent = Intent(this, SearchingActivity::class.java)
            startActivity(searchButtonIntent)
        }

        mediaButton.setOnClickListener {
            val mediaButtonIntent = Intent(this, MediaActivity::class.java)
            startActivity(mediaButtonIntent)

        }

        settingsButton.setOnClickListener {
            val settingsButtonIntent = Intent(this, SettingsActivity::class.java)
            startActivity(settingsButtonIntent)
        }


    }
}