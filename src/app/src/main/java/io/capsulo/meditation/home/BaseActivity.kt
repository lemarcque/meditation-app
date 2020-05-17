package io.capsulo.meditation.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.capsulo.meditation.R

class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }

}
