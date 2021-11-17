package com.sai.stream;

import java.util.ArrayList;
import java.util.List;

public class Test9 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'M', 22, 3, 8.3);
        Student st2 = new Student("Nickolay", 'M', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'F', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'M', 35, 4, 7);
        Student st5 = new Student("Mariya", 'F', 23, 3, 7.4);

        List<Student> students = new ArrayList<>();

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

//        Student min = students.stream().min((x, y) -> x.getAge() - y.getAge()).get();
//
//        Student max = students.stream().max((x, y) -> x.getAge() - y.getAge()).get();
//
//        System.out.println(min);
//        System.out.println(max);

        students.stream().filter(e -> e.getAge() > 20).limit(2).forEach(System.out::println);
    }
}
