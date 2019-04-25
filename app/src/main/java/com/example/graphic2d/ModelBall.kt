package com.example.graphic2d

import android.graphics.Paint
import android.util.Size
import stanford.androidlib.graphics.GOval

class ModelBall(private var figure: GOval,
                private var dx: Float,
                private var dy: Float,
                private var size:Float,
                private var paint: Paint) {
        var FigureGOval: GOval
            get() = figure
            set(newValue) {
                figure = newValue
            }

        var DX: Float
            get() = dx
            set(newValue) {
                dx = newValue
            }
    var DY: Float
        get() = dy
        set(newValue) {
            dy = newValue
        }
    var SIZE: Float
        get() = size
        set(newValue) {
            size = newValue
        }
    var Paint: Paint
        get() = paint
        set(newValue) {
            paint = newValue
        }

    }
