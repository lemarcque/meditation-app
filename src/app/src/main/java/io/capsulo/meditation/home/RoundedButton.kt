package io.capsulo.meditation.home

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import android.widget.FrameLayout
import io.capsulo.meditation.R
import kotlinx.android.synthetic.main.view_roundedbutton.view.*

/**
 * Button with round corner.
 */
class RoundedButton(context: Context?, attrs: AttributeSet?) : FrameLayout(context, attrs) {

    init {
        // Inflate the layout
        inflate(context, R.layout.view_roundedbutton, this)

        // Retrieve and apply custom attributes
        context!!.theme.obtainStyledAttributes(
            attrs,
            R.styleable.RoundedButton, 0, 0).apply {

            try {
                btn_roundedbutton.text = getString(R.styleable.RoundedButton_text)
            }finally {
                // TypedArray objects are a shared resource and must be recycled after use.
                recycle()
            }
        }
    }

    override fun onViewAdded(child: View?) {
        btn_roundedbutton.setOnTouchListener { view, motionEvent ->
            if(motionEvent.action == MotionEvent.ACTION_DOWN) {
                // scale your value
                val reducedvalue = 0.9f
                view.animate()
                    .scaleX(reducedvalue)
                    .scaleY(reducedvalue).duration = 150
            }else if(motionEvent.action == MotionEvent.ACTION_UP) {
                view.animate()
                    .scaleX(1f)
                    .scaleY(1f).duration = 150
            }
            true
        }
    }
}