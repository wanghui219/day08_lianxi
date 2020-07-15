package com.example.day08_lianxi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class MyCircle extends View {

    private final Paint paint;

    public MyCircle(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        //设置画笔
        paint = new Paint();
        paint.setStrokeWidth(10);
        paint.setAntiAlias(true);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(100,100,50,paint);
        super.onDraw(canvas);
    }
}
