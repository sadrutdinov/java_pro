package com.designPatterns.structal.adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();


        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
