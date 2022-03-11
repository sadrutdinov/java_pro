package com.solid.srp.employee_arch;

public class EmployeeReportFormatter extends ReportFormatter{
    public EmployeeReportFormatter(Object o, FormatType formatType) {
        super(o, formatType);
    }

    public String getFormattedEmployee() {
        return formattedOutput;
    }
}
