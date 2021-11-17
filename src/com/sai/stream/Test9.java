package com.sai.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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

        List<Integer> courses = students.stream().mapToInt(e -> e.getCourse())
                .boxed()
                .collect(Collectors.toList());

        System.out.println(courses);

        int max = students.stream().mapToInt(e -> e.getCourse()).max().getAsInt();
        System.out.println(max);
        int min = students.stream().mapToInt(e -> e.getCourse()).min().getAsInt();
        System.out.println(min);
        int sum = students.stream().mapToInt(e -> e.getCourse()).sum();
        System.out.println(sum);
        double average = students.stream().mapToInt(e -> e.getCourse()).average().getAsDouble();
        System.out.println(average);

//        Student min = students.stream().min((x, y) -> x.getAge() - y.getAge()).get();
//
//        Student max = students.stream().max((x, y) -> x.getAge() - y.getAge()).get();
//
//        System.out.println(min);
//        System.out.println(max);

//        students.stream().filter(e -> e.getAge() > 20).forEach(System.out::println);
//        System.out.println("---------------------------");
//        students.stream().filter(e -> e.getAge() > 20).limit(2).forEach(System.out::println);
//        System.out.println("---------------------------");
//        students.stream().filter(e -> e.getAge() > 20).skip(2).forEach(System.out::println);
    }
}
