package com.github.desfate.chartlib

import android.content.Context
import android.view.GestureDetector.OnGestureListener
import android.view.MotionEvent
import android.view.ScaleGestureDetector
import android.view.ScaleGestureDetector.OnScaleGestureListener

class GridChart(context: Context?) : BaseChart(context)
    , OnGestureListener
    , OnScaleGestureListener
    , ITouchEventNotify
    , ITouchEventResponse{
    override fun onShowPress(e: MotionEvent?) {
        TODO("Not yet implemented")
    }

    override fun onSingleTapUp(e: MotionEvent?): Boolean {
        TODO("Not yet implemented")
    }

    override fun onDown(e: MotionEvent?): Boolean {
        TODO("Not yet implemented")
    }

    override fun onFling(
        e1: MotionEvent?,
        e2: MotionEvent?,
        velocityX: Float,
        velocityY: Float
    ): Boolean {
        TODO("Not yet implemented")
    }

    override fun onScroll(
        e1: MotionEvent?,
        e2: MotionEvent?,
        distanceX: Float,
        distanceY: Float
    ): Boolean {
        TODO("Not yet implemented")
    }

    override fun onLongPress(e: MotionEvent?) {
        TODO("Not yet implemented")
    }

    override fun onScaleBegin(detector: ScaleGestureDetector?): Boolean {
        TODO("Not yet implemented")
    }

    override fun onScaleEnd(detector: ScaleGestureDetector?) {
        TODO("Not yet implemented")
    }

    override fun onScale(detector: ScaleGestureDetector?): Boolean {
        TODO("Not yet implemented")
    }

    override fun notifyEventAll(eventId: Int, chart: GridChart?) {
        TODO("Not yet implemented")
    }

    override fun addNotify(notify: ITouchEventResponse?) {
        TODO("Not yet implemented")
    }

    override fun removeNotify(i: Int) {
        TODO("Not yet implemented")
    }

    override fun removeAllNotify() {
        TODO("Not yet implemented")
    }

    override fun notifyEvent(eventId: Int, chart: GridChart?) {
        TODO("Not yet implemented")
    }
}