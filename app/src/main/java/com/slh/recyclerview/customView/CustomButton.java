package com.slh.recyclerview.customView;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomButton extends androidx.appcompat.widget.AppCompatButton {
    public CustomButton(@NonNull Context context) {
        super(context);
    }

    public CustomButton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomButton(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
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
        Thread.dumpStack();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.e("CustomView",getClass()+"onDraw()");
        Thread.dumpStack();
    }

}
