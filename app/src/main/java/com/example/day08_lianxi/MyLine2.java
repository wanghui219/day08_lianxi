package com.example.day08_lianxi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class MyLine2 extends View {

    private final Paint paint;

    public MyLine2(Context context, @Nullable AttributeSet attrs) {
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
        int firstX=90;
        int firstY=40;
        int secondX=-110;
        int secondY=250;
        canvas.drawLine(firstX,firstY,secondX,secondY,paint);
        super.onDraw(canvas);
    }
    }

