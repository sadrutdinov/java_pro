package com.solid.ocp.shape_ocp_violation;

public class Main {
    public static void main(String[] args) {
        var rect1 = new Rectangle(10, 5);
        var rect2 = new Rectangle(20, 37.3);

        var ac = new AreaCalculator();

        double area = ac.areaCalc(rect1, rect2);


        System.out.println(area);

    }
}
