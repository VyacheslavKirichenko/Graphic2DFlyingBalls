package com.example.graphic2d

import android.content.Context
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import stanford.androidlib.graphics.GCanvas
import stanford.androidlib.graphics.GColor
import stanford.androidlib.graphics.GOval
import java.util.*
import kotlin.collections.ArrayList

class BouncingBallCanvas(context: Context, attributeSet: AttributeSet) : GCanvas(context, attributeSet) {

    var balls = ArrayList<ModelBall>()
    override fun init() {

        generateRandomBalls()

        for (i in 0..balls.count() - 1) {
                add(balls[i].FigureGOval.setFillColor(balls[i].Paint))
        }
        animate(60) {
            moveBall()
        }
    }

    fun generateRandomBalls() {
        for (i in 0..8) {                                     // ----- set quantity of balls
            val rndSizeModel = (20..250).random()
            val rndCoordX = (rndSizeModel..width-rndSizeModel).random()
            val rndCoordY = (rndSizeModel..height-rndSizeModel).random()
            val rndDx = (2..15).random()
            val rndDy = (2..15).random()
            val paint = Paint()
            paint.setARGB((255), (0..255).random(), (0..255).random(), (0..255).random())
            val ball = ModelBall(
                (GOval(
                    rndCoordX.toFloat(), rndCoordY.toFloat(), rndSizeModel.toFloat(),
                    rndSizeModel.toFloat()
                )).setFilled(true) as GOval, rndDx.toFloat(), rndDy.toFloat(), rndSizeModel.toFloat(), paint
            )
            balls.add(ball)
        }
    }

    fun moveBall() {

        for (i in 0..balls.count() - 1) {
            val t = Thread {
                balls[i].FigureGOval.moveBy(balls[i].DX, balls[i].DY)
                if (balls[i].FigureGOval.rightX >= width || balls[i].FigureGOval.x <= 0) {
                    balls[i].DX = -balls[i].DX
                }
                if (balls[i].FigureGOval.bottomY >= height || balls[i].FigureGOval.y <= 0) {
                    balls[i].DY = -balls[i].DY
                }
                Thread.sleep(50)
            }
            t.start()
        }
    }

}