package io.capsulo.meditation.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.capsulo.meditation.R

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
        supportFragmentManager
            .beginTransaction()
            .add(R.id.activity_base, HomeFragment())
            .commit()
    }

}
