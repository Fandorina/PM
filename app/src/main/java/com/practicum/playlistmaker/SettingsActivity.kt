package com.practicum.playlistmaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.content.Intent
import android.net.Uri
import android.widget.RelativeLayout

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val backButton = findViewById<ImageView>(R.id.backButton)

        backButton.setOnClickListener {
            finish()
        }

        val settingsAcShare: RelativeLayout = findViewById(R.id.settings_share)
        settingsAcShare.setOnClickListener {
            val intent: Intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT, getString(R.string.settings_share_intent_text))
            startActivity(intent)
        }
        val settingsAcSupport: RelativeLayout = findViewById(R.id.settings_support)
        settingsAcSupport.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data =
                Uri.parse("mailto:" + getString(R.string.settings_support_intent_email_address))
            intent.putExtra(
                Intent.EXTRA_SUBJECT,
                getString(R.string.settings_support_intent_email_subject)
            )
            intent.putExtra(
                Intent.EXTRA_TEXT,
                getString(R.string.settings_support_intent_email_text)
            )
            startActivity(intent)
        }
        val settingsAcAgreement: RelativeLayout = findViewById(R.id.settings_agreement)
        settingsAcAgreement.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(getString(R.string.settings_agreement)))
            startActivity(intent)
        }
    }
}