package com.algorithmsAndDataStructures;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {


    public static void main(String[] args) {
        final Item item1 = new Item(4, 20); // 5
        final Item item2 = new Item(3, 18); // 6
        final Item item3 = new Item(2, 14); // 7

        final Item[] items = {item1, item2, item3};

        // сортировка O (N * log(N))
        Arrays.sort(items, Comparator.comparingDouble(Item::valuePerUnitOfWeight).reversed());

        System.out.println(Arrays.toString(items));

        final int W = 7;
        int weightSoFar = 0;
        double valuesSoFar = 0;

        int currentItem = 0;

        while (currentItem < items.length && weightSoFar != W) {
            if (weightSoFar + items[currentItem].getWeight() < W) {
                // берем объект целиком
                weightSoFar += items[currentItem].getWeight();
                valuesSoFar += items[currentItem].getValue();

            } else {
                // берем часть объекта
                int need = (W - weightSoFar);
                weightSoFar += need;
                valuesSoFar += need * items[currentItem].valuePerUnitOfWeight();

            }

            currentItem++;
        }

        System.out.println(valuesSoFar);
    }
}

class Item {
    private int weight;
    private int value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    public double valuePerUnitOfWeight() {
        return value / (double) weight;
    }

    @Override
    public String toString() {
        return "{w:" + weight + ",v:" + value + "}";
    }
}
