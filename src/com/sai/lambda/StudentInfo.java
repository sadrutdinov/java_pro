package com.sai.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInfo {
    void testStudents(ArrayList<Student> students, Predicate<Student> pr) {
        for (Student s : students) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }


}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'M', 22, 3, 8.3);
        Student st2 = new Student("Nickolay", 'M', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'F', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'M', 35, 4, 7);
        Student st5 = new Student("Mariya", 'F', 23, 3, 7.4);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();

        Function<Student, Double> f = student -> student.avgGrade;

        System.out.println(avgOfSomething(students, student -> (double) student.age));


//        Predicate<Student> p1 = s -> s.age < 30;
//        Predicate<Student> p2 = s -> s.avgGrade > 7.5;
//        Predicate<Student> p3 = s -> s.sex == 'M';
//        Predicate<Student> p4 = p1.and(p2).and(p3);
//        Predicate<Student> p5 = p1.or(p3);
//        Predicate<Student> p6 = p1.negate();
//
//
//        info.testStudents(students, p1);
//        System.out.println("-----------------");
//        info.testStudents(students, p2);
//        System.out.println("-----------------");
//        info.testStudents(students, p3);
//        System.out.println("-----------------");
//        info.testStudents(students, p4);
//        System.out.println("-----------------");
//        info.testStudents(students, p5);
//        System.out.println("-----------------");
//        info.testStudents(students, p6);


    }

    private static double avgOfSomething(List<Student> list, Function<Student, Double> f) {
        double result = 0;

        for (Student student : list) {
            result += f.apply(student);
        }

        return result / list.size();
    }
}
