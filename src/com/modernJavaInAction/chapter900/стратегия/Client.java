package com.modernJavaInAction.chapter900.стратегия;

public class Client {
    public static void main(String[] args) {
        Validator numericValidator = new Validator(new IsNumeric());
        System.out.println(numericValidator.validate("hello"));
        Validator lowerCaseValidator = new Validator(new IsAllLowerCase());
        System.out.println(lowerCaseValidator.validate("xascdvf"));


        Validator numericValidatorLambda = new Validator((String s) -> s.matches("\\d+"));
        System.out.println(numericValidatorLambda.validate("hello"));
        Validator lowerCaseValidatorLambda = new Validator((String s) -> s.matches("[a-z]+"));
        System.out.println(lowerCaseValidatorLambda.validate("DAWEFDWE"));


    }
}
