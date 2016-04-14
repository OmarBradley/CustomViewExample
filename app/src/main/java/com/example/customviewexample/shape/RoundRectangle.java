package com.example.customviewexample.shape;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

/**
 * Created by 재화 on 2016-04-14.
 */
public class RoundRectangle implements DrawShapeStrategy {

    @Override
    public void drawShape(Canvas canvas, Paint paint) {
        paint.setColor(Color.BLUE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);

        int rx = 30;
        int ry = 15;

        RectF rect = new RectF(100, 100, 300, 300);
        canvas.drawRoundRect(rect, rx, ry, paint);
    }
}
