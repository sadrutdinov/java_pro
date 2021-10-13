package com.sai.nested_class;

public class Test {
    static class A{ // статичный вложенный класс

    }

    class B{ // просто вложенный класс

    }

    void method() {
        class C { // локальный класс (внутри метода)

        }
    }
}
