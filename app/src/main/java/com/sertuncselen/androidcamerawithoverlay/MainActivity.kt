package com.sertuncselen.androidcamerawithoverlay

import com.sertuncselen.androidcamerawithoverlay.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.otaliastudios.cameraview.CameraException
import com.otaliastudios.cameraview.CameraListener
import com.otaliastudios.cameraview.CameraView
import com.otaliastudios.cameraview.PictureResult


class MainActivity : AppCompatActivity() {

    private lateinit var camera: CameraView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        camera = findViewById(R.id.camera)
        camera.setLifecycleOwner(this)
        camera.addCameraListener(object : CameraListener() {
            override fun onPictureTaken(result: PictureResult) {

            }

            override fun onCameraError(exception: CameraException) {

            }
        })
    }
}
