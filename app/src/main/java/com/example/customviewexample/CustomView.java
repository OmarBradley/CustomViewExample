package com.example.customviewexample;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.example.customviewexample.factory.DrawFactory;
import com.example.customviewexample.shape.DrawShapeStrategy;

/**
 * Created by 재화 on 2016-04-14.
 */
public class CustomView extends View {

    DrawShapeStrategy drawShapeStrategy;
    Paint paint;

    public CustomView(Context context) {
        super(context);
        drawShapeStrategy = new DrawFactory().getDrawShapeStrategy();
        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawShapeStrategy.drawShape(canvas, paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            Toast.makeText(super.getContext(), "MotionEvent.ACTION_DOWN : " + event.getX() + " , " + event.getY(), Toast.LENGTH_SHORT).show();
        }
        return super.onTouchEvent(event);
    }
}
