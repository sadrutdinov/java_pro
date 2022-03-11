package com.solid.srp.employee_arch;

public class ClientModule {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Andrew", "surgery", true);
        ClientModule.hireNewEmployee(e1);
        ClientModule.printEmployeeReport(e1, FormatType.CSV);
    }

    public static void hireNewEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(employee);
    }

    public static void terminateEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(employee);
    }

    public static void printEmployeeReport(Employee employee, FormatType formatType) {
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
        System.out.println(formatter.getFormattedEmployee());
    }
}
