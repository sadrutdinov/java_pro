package com.sai.comparations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List list = new ArrayList<Employee>();

        Employee emp1 = new Employee(100, "Zaur", "Tregulov", 12345);
        Employee emp2 = new Employee(15, "Ivan", "Petrov", 6542);
        Employee emp3 = new Employee(123, "Ivan", "Sidorov", 8542);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.println("before sorting \n" + list);
        Collections.sort(list, new SalaryComparator());

        System.out.println("After sorting \n" +  list);
    }
}

class Employee
        implements Comparable<Employee>
{
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        if (this.id == anotherEmp.id) {
            return 0;
        }
        else return  (this.id > anotherEmp.id) ? 1: -1;
//        return this.id - anotherEmp.id;
//        return this.name.compareTo(anotherEmp.name);

//       int res = this.name.compareTo(anotherEmp.name);
//
//       if (res == 0) {
//           res = this.surname.compareTo(anotherEmp.surname);
//       }
//
//        return res;

    }
}

//class IdComparator implements Comparator<Employee> {
//
//    @Override
//    public int compare(Employee emp1, Employee emp2) {
//                if (emp1.id == emp2.id) {
//            return 0;
//        }
//        else return  (emp1.id > emp2.id) ? 1: -1;
//    }
//}

class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary - emp2.salary;
    }
}
