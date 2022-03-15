package com.solid.lsp;

public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        p.doSmth();
        c.doSmth();
    }
}
