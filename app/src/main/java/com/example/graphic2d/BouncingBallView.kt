package com.example.graphic2d

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View

class BouncingBallView(context: Context, attributeSet: AttributeSet):View (context,attributeSet) {
private  val  SIZE = 100f
    private  var  ballX = 0f
    private  var  ballY = 0f
    private  var  dx = 15f
    private  var  dy = 9f

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        if (canvas==null) return
val purple  = Paint()
        val black = Paint()
        black.setARGB(255,33,33,33)
        purple.setARGB(255,121,85 ,72)
        canvas.drawOval(RectF(700f,700f,300f,300f),purple)
        canvas.drawOval(RectF(600f,200f,800f,400f),purple)

        canvas.drawOval(RectF(200f,200f,400f,400f),purple)
        canvas.drawOval(RectF(400f,400f,450f,450f),black)
        canvas.drawOval(RectF(550f,400f,600f,450f),black)
        canvas.drawOval(RectF(475f,500f,525f,550f),black)
        canvas.drawLine(400f,600f, 600f,600f,black)

        canvas.drawRect(RectF(400f,700f,600f,1000f),purple)

    }

}