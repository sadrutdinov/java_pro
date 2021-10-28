package com.sai.lambda;

import java.util.ArrayList;

public class StudentInfo {
    void testStudents(ArrayList<Student> students, StudentsCheck check) {
        for(Student s: students) {
            if (check.check(s)) {
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
        Student st5 = new Student("Mariya", 'F', 23, 3, 9.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();
        info.testStudents(students, (Student s) -> { return s.age<30;});
        System.out.println("-----------------");
//        students.forEach(student -> {if (student.age < 30) {
//            System.out.println(student);
//        }});
//        System.out.println("-----------------");
//        info.testStudents(students, (Student s) -> { return s.avgGrade>8;});



    }
}

interface StudentsCheck {
    boolean check(Student student);
}

