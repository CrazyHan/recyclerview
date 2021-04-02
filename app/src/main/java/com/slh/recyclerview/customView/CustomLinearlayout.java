package com.slh.recyclerview.customView;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class CustomLinearlayout extends LinearLayout {
    public CustomLinearlayout(Context context) {
        super(context);
    }

    public CustomLinearlayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomLinearlayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CustomLinearlayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.e("CustomView",getClass()+"onMeasure()");
        Thread.dumpStack();

    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);

        Log.e("CustomView",getClass()+"onLayout()");

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.e("CustomView",getClass()+"onDraw()");
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        if(ev.getAction() == MotionEvent.ACTION_DOWN) {
            Log.e("dispatchTouchEvent", "CustomLinearlayout Event Down");
        }else if(ev.getAction() == MotionEvent.ACTION_MOVE){
            Log.e("dispatchTouchEvent", "CustomLinearlayout Event Move");
        }else if(ev.getAction() == MotionEvent.ACTION_UP){
            Log.e("dispatchTouchEvent", "CustomLinearlayout Event UP");
        }

        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if(ev.getAction() == MotionEvent.ACTION_DOWN) {
            Log.e("onInterceptTouchEvent", "CustomLinearlayout Event Down");
        }else if(ev.getAction() == MotionEvent.ACTION_MOVE){
            Log.e("onInterceptTouchEvent", "CustomLinearlayout Event Move");
        }else if(ev.getAction() == MotionEvent.ACTION_UP){
            Log.e("onInterceptTouchEvent", "CustomLinearlayout Event UP");
        }

        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction() == MotionEvent.ACTION_DOWN) {
            Log.e("onTouchEvent", "CustomLinearlayout Event Down");
        }else if(event.getAction() == MotionEvent.ACTION_MOVE){
            Log.e("onTouchEvent", "CustomLinearlayout Event Move");
        }else if(event.getAction() == MotionEvent.ACTION_UP){
            Log.e("onTouchEvent", "CustomLinearlayout Event UP");
        }

        return super.onTouchEvent(event);
    }
}
