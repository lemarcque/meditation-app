package io.capsulo.meditation.home

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import android.widget.FrameLayout
import android.widget.LinearLayout
import io.capsulo.meditation.R
import kotlinx.android.synthetic.main.view_modebutton.view.*

/**
 * View with Button.
 */
class SoundControllerView(context: Context?, attrs: AttributeSet?) : LinearLayout(context, attrs) {

    init {
        // Inflate the layout
        inflate(context, R.layout.view_soundcontroller, this)

        // Retrieve and apply custom attributes
        /*context!!.theme.obtainStyledAttributes(
            attrs,
            R.styleable.ModeButton, 0, 0).apply {

            try {
                imageview_modebutton.setImageDrawable(getDrawable(R.styleable.ModeButton_srcImage))
                textview_modebutton.text = getString(R.styleable.ModeButton_text)
            }finally {
                // TypedArray objects are a shared resource and must be recycled after use.
                recycle()
            }
        }*/
    }

}