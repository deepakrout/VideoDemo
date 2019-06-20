package com.iappstogo.videodemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView
import android.net.Uri
import android.widget.MediaController


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoView = findViewById<VideoView>(R.id.videoView)
        val path = "android.resource://" + packageName + "/" + R.raw.demovideo
        val mediaController = MediaController(this)
        videoView?.setVideoURI(Uri.parse(path))
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)
        videoView.start()


    }
}
