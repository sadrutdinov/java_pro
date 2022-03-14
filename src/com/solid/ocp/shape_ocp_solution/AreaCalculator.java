package com.solid.ocp.shape_ocp_solution;

public class AreaCalculator {
    public double areaCalc(Shape... shapes) {
        double area = 0;

        for (var shape: shapes) {
            area+= shape.area();
        }

        return area;
    }

} 
