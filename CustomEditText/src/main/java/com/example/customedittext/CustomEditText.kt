package com.example.customedittext

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText

class CustomEditText @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatEditText(context, attrs, defStyleAttr) {

    private var backgroundColor = Color.WHITE
//    private var strokeColor = Color.BLACK
    private var cornerRadius = 0f


    fun getBackgroundColor() = backgroundColor

    fun setEditTextBackgroundColor(color: Int){
        backgroundColor = color
    }

//    fun getStrokeColor() = strokeColor
//
//    fun setStrokeColor(color: Int){
//        strokeColor = color
//    }

    fun getCornerRadius() = cornerRadius

    fun setCornerRadius(radius: Float){
        cornerRadius = radius
    }

    init {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomEditText)
        backgroundColor = typedArray.getColor(R.styleable.CustomEditText_backgroundColor, backgroundColor)
//        strokeColor = typedArray.getColor(R.styleable.CustomEditText_strokeColor, strokeColor)
        cornerRadius = typedArray.getDimension(R.styleable.CustomEditText_cornerRadius, cornerRadius)
        typedArray.recycle()

        // Apply the EditText properties, including background and corner radius
        applyEditTextProperties()
    }

    private fun applyEditTextProperties() {
        // Create a GradientDrawable for the background
        val backgroundDrawable = GradientDrawable()
        backgroundDrawable.setColor(backgroundColor)
//        backgroundDrawable.setStroke(2, strokeColor) // Adjust the stroke width as needed
        backgroundDrawable.cornerRadius = cornerRadius
        background = backgroundDrawable
    }

    // Override onDraw if needed
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        applyEditTextProperties()
        // Additional custom drawing code if necessary
    }
}