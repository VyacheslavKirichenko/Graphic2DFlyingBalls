package com.example.graphic2d

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

class BouncingBallView(context: Context, attributeSet: AttributeSet):View (context,attributeSet) {
private  val  SIZE = 50f
    private  var  ballX = 0f
    private  var  ballY = 0f
    private  var  dx = 15f
    private  var  dy = 9f

//    override fun onDraw(canvas: Canvas?) {
//        super.onDraw(canvas)
//        if (canvas==null) return
//val purple  = Paint()
//        val black = Paint()
//      //  black.setARGB(255,33,33,33)
//        purple.setARGB(255,121,85 ,72)
//        purple.typeface = Typeface.create(Typeface.MONOSPACE, Typeface.BOLD)
//        purple.textSize = 50f
//        canvas.drawOval(RectF(ballX,ballY,ballX+SIZE,ballY+SIZE),purple)
//        canvas.drawText("Hello", 400f, 400f,purple)
//        var img = BitmapFactory.decodeResource(resources, R.drawable.b)
//        img = Bitmap.createScaledBitmap(img,200, 200, false)
//        canvas.drawBitmap(img,140f, 90f, null)
//
//
//
//
//
//    }

//    fun move () {
//        ballX+=dx
//        if (ballX+SIZE >=width || ballX<=0){
//            dx = -dx
//        }
//        ballY+=dy
//        if (ballY+SIZE >=height || ballY<=0) {
//            dy = -dy
//        }
//        postInvalidate()
//    }

}