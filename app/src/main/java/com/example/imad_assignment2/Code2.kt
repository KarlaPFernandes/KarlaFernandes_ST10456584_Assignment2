package com.example.imad_assignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView



class Code2 : AppCompatActivity() {

    // Views
    private lateinit var image: ImageView
    private lateinit var hungerCountTextView: TextView
    private lateinit var cleanCountTextView: TextView
    private lateinit var happyCountTextView: TextView

    // Click counts
    private var feedClickCount: Int = 0
    private var cleanClickCount: Int = 0
    private var playClickCount: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code2)

// Initialize views
        image = findViewById(R.id.puppyView)
        hungerCountTextView = findViewById(R.id.hungerCount)
        cleanCountTextView = findViewById(R.id.cleanCount)
        happyCountTextView = findViewById(R.id.happyCount)

        // Set initial counts
        updateCounts()

        // Set click listeners for buttons
        findViewById<Button>(R.id.feedButton).setOnClickListener {
            feedPet()
        }

        findViewById<Button>(R.id.cleanButton).setOnClickListener {
            cleanPet()
        }

        findViewById<Button>(R.id.playButton).setOnClickListener {
            playWithPet()
        }
    }

    private fun feedPet() {
        image.setImageResource(R.drawable.feedpuppy)
        image.scaleType = ImageView.ScaleType.FIT_CENTER
        feedClickCount++
        updateCounts()
        // You can add additional logic here for updating status values
    }

    private fun cleanPet() {
        image.setImageResource(R.drawable.cleanpuppy2)
        image.scaleType = ImageView.ScaleType.FIT_CENTER
        cleanClickCount++
        updateCounts()
        // You can add additional logic here for updating status values
    }

    private fun playWithPet() {
        image.setImageResource(R.drawable.playpuppy2__1_)
        image.scaleType = ImageView.ScaleType.FIT_CENTER
        playClickCount++
        updateCounts()
        // You can add additional logic here for updating status values
    }

    // Update text views with current counts
    private fun updateCounts() {
            hungerCountTextView.text = if (feedClickCount > 0) "Feed count: $feedClickCount" else ""
            cleanCountTextView.text = if (cleanClickCount > 0) "Clean count: $cleanClickCount" else ""
            happyCountTextView.text = if (playClickCount > 0) "Play count: $playClickCount" else ""
        }


    }

