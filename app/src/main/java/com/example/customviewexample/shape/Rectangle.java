package com.example.customviewexample.shape;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

/**
 * Created by 재화 on 2016-04-14.
 */
public class Rectangle implements DrawShapeStrategy {

    @Override
    public void drawShape(Canvas canvas, Paint paint) {
        paint.setColor(Color.BLUE);
        Rect rect = new Rect(100, 100, 300, 300);
        canvas.drawRect(rect, paint);
    }
}
