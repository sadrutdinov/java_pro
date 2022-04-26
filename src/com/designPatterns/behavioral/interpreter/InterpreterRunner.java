package com.designPatterns.behavioral.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {

        Expression isJava = getJavaEx();
        Expression isJavaEEDeveloper = getJavaEEEx();


        System.out.println("Does developer knows Java Core: " + isJava.interpret("Java Core"));
        System.out.println("Does developer knows Java EE: " + isJavaEEDeveloper.interpret("Java Spring"));

    }

    public static Expression getJavaEx() {
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");

        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEEEx() {
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");


        return new AndExpression(java, spring);

    }
}
