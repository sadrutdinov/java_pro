package com.modernJavaInAction.chapter1100;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String name = "РОСГОССТРАХНАХ";
        Insurance insurance = new Insurance();
        insurance.setName(name);
        Optional<Insurance> optionalInsurance = Optional.of(insurance);

        Car car = new Car();
        car.setInsurance(optionalInsurance);
        Optional<Car> optionalCar = Optional.of(car);

        Person person = new Person();
        person.setCar(optionalCar);

        Optional<Person> optPerson = Optional.of(person);

        String carInsuranceName = getCarInsuranceName(optPerson);
        System.out.println(carInsuranceName);


    }

    private static String getCarInsuranceName(Optional<Person> optPerson) {
        return optPerson.flatMap(Person::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("Unknown");
    }
}
