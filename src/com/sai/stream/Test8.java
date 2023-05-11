package com.sai.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test8 {
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

//        Map<Integer, List<Student>> map =
//                students.stream()
//                        .peek(el -> el.setName(el.getName().toUpperCase()))
//                        .collect(Collectors.groupingBy(Student::getCourse));
//
//
//        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()
//        ) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }

        Map<Boolean, List<Student>> map = students.stream()
                .collect(Collectors.partitioningBy(el -> el.getAvgGrade() > 7.5));


        for (Map.Entry<Boolean, List<Student>> entry : map.entrySet()
        ) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
