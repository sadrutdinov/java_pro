package com.modernJavaInAction.chapter381;

import com.modernJavaInAction.chapter211.Color;

public class Apple {
    private String country;
    private Integer weight;
    private Color color;

    public Apple(String country, Integer weight, Color color) {
        this.country = country;
        this.weight = weight;
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public Integer getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "country='" + country + '\'' +
                ", weight=" + weight +
                ", color=" + color +
                '}';
    }
}
