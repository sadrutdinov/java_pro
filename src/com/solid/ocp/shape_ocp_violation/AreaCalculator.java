package com.solid.ocp.shape_ocp_violation;

public class AreaCalculator {
//    public double areaCalc(Rectangle... rectangles) {
//        double area = 0;
//
//        for (var rectangle : rectangles) {
//            area += rectangle.getHeight() * rectangle.getWidth();
//        }
//
//        return area;
//    }

    public double areaCalc(Object... shapes) {
        double area = 0;

        for (var shape : shapes) {

            if (shape instanceof Rectangle) {
                var rectangle = (Rectangle) shape;
                area += rectangle.getHeight() * rectangle.getWidth();
            } else {
                var circle = (Circle) shape;
                area += Math.pow(circle.getRadius(), 2) * Math.PI;
            }
        }

        return area;
    }
}
