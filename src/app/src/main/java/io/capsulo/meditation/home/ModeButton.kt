package io.capsulo.meditation.home

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import android.widget.FrameLayout
import io.capsulo.meditation.R
import kotlinx.android.synthetic.main.view_modebutton.view.*

/**
 * View with Button.
 */
class ModeButton(context: Context?, attrs: AttributeSet?) : FrameLayout(context, attrs) {

    init {
        // Inflate the layout
        inflate(context, R.layout.view_modebutton, this)

        // Retrieve and apply custom attributes
        context!!.theme.obtainStyledAttributes(
            attrs,
            R.styleable.ModeButton, 0, 0).apply {

            try {
                imageview_modebutton.setImageDrawable(getDrawable(R.styleable.ModeButton_srcImage))
                textview_modebutton.text = getString(R.styleable.ModeButton_text)
            }finally {
                // TypedArray objects are a shared resource and must be recycled after use.
                recycle()
            }
        }
    }

    override fun onViewAdded(child: View?) {
        framelayout_button.setOnTouchListener { view, motionEvent ->
            if(motionEvent.action == MotionEvent.ACTION_DOWN) {
                // scale your value
                val reducedvalue = 0.95f
                view.animate()
                    .scaleX(reducedvalue)
                    .scaleY(reducedvalue).duration = 100
            }else if(motionEvent.action == MotionEvent.ACTION_UP) {
                view.animate()
                    .scaleX(1f)
                    .scaleY(1f).duration = 100
            }
            true
        }
    }
}