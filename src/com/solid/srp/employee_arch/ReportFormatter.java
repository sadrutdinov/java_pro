package com.solid.srp.employee_arch;

public class ReportFormatter {
    String formattedOutput;

    public ReportFormatter(Object o, FormatType formatType) {
        switch (formatType) {
            case XML:
                formattedOutput = convertObjectToXml(o);
                break;
            case CSV:
                formattedOutput = convertObjectToCsv(o);
                break;
        }
    }

    private String convertObjectToXml(Object o) {
        return "converted to xml " + o.toString();
    }


    private String convertObjectToCsv(Object o) {
        return "converted to csv " + o.toString();
    }

}
