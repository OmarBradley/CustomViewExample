package com.example.customviewexample.factory;

import com.example.customviewexample.shape.DrawShapeStrategy;
import com.example.customviewexample.shape.RoundRectangle;

/**
 * Created by 재화 on 2016-04-14.
 */
public class DrawFactory {

    public DrawShapeStrategy getDrawShapeStrategy() {
        return new RoundRectangle();
    }
}
