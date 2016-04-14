package com.example.customviewexample.shape;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by 재화 on 2016-04-14.
 */
public class LineAndPoint implements DrawShapeStrategy {

    private final static int COUNT = 30;
    private final static float WIDTH = 300;
    private float[] point;

    // template method 형식과 비슷
    @Override
    public final void drawShape(Canvas canvas, Paint paint) {
        initLineAndPoint();
        drawLineAndPoint(canvas, paint);
    }

    private void initLineAndPoint() {
        int lineCount = COUNT + 1;
        point = new float[lineCount << 2];
        float delta = WIDTH / COUNT;
        int index = 0;
        for (int i = 0; i <= COUNT; i++) {
            point[index++] = 0;
            point[index++] = i * delta;
            point[index++] = WIDTH - i * delta;
            point[index++] = 0;
        }
    }

    private void drawLineAndPoint(Canvas canvas, Paint paint) {
        canvas.save();
        canvas.translate(100, 100);

        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(2);
        canvas.drawLines(point, paint);

        paint.setColor(Color.RED);
        paint.setStrokeWidth(5);
        canvas.drawPoints(point, paint);

        canvas.restore();
    }
}
