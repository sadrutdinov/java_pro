package com.sai.nested_class.static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    public void method() {
        System.out.println(Engine.countOfObjects);
        Engine engine = new Engine(22);
        System.out.println(engine.horsePower);
    }

    @Override
    public String toString() {
        return "My Car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine {
        private int horsePower;

        static int countOfObjects;

        public Engine(int horsePower) {
            System.out.println(a);
           // System.out.println(doorCount);
            this.horsePower = horsePower;
            countOfObjects++;
        }

        @Override
        public String toString() {
            return "My Engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}


class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(256);

        System.out.println(engine);

        Car car = new Car("red", 2, engine);

        System.out.println(car);
    }
}