package com.designPatterns.creational.factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory factory = createDeveloperBySpeciality("php");
        Developer developer = factory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("Java")) {
            return new JavaDeveloperFactory();
        }
        else if (speciality.equalsIgnoreCase("Cpp")) {
            return new CppDeveloperFactory();
        }
        else if (speciality.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + " is unknown speciality");
        }
    }
}
