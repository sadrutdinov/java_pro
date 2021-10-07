package com.sai.collections.list_intterface;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3,8.3);
        Student st2 = new Student("Nickolay", 'm', 28, 2,6.4);
        Student st3 = new Student("elena", 'f', 19, 2,6.4);
        Student st4 = new Student("elena", 'f', 19, 2,6.4);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);


        System.out.println(studentList);

        studentList.remove(st4);

        System.out.println(studentList);


        System.out.println(studentList.indexOf(st1));


    }

}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex &&
                age == student.age &&
                course == student.course &&
                Double.compare(student.avgGrade, avgGrade) == 0 &&
                Objects.equals(name, student.name);
    }


}
