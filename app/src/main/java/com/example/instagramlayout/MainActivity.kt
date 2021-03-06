package com.example.instagramlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Glide.with(this)
            .load(R.drawable.foto_tiga)
            .circleCrop()
            .into(avatar)

        Glide.with(this)
            .load(R.drawable.foto_tiga)
            .circleCrop()
            .into(ivStory)
    }
}