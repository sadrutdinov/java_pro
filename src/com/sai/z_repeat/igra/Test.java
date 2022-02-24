package com.sai.z_repeat.igra;



public class Test {
    public static void main(String[] args) {

        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Mariya", 15);

        Student student1 = new Student("Nickolay", 20);
        Student student2 = new Student("Xenia", 18);

        Employee employee1 = new Employee("Zaur", 32);
        Employee employee2 = new Employee("Mikhail", 47);


        Team<Schoolar> schoolarTeam = new Team<>("Dragons");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);

        Team<Student> studentTeam = new Team("GO GO");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team("Hard Work");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Team<Schoolar> schoolarTeam2 = new Team<>("Dogs");
        Schoolar schoolar3 = new Schoolar("Alex", 13);
        Schoolar schoolar4 = new Schoolar("Petr", 15);
        schoolarTeam.addNewParticipant(schoolar3);
        schoolarTeam.addNewParticipant(schoolar4);

        schoolarTeam.playWith(schoolarTeam2);

    }
}
