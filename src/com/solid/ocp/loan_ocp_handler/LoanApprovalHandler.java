package com.solid.ocp.loan_ocp_handler;

public class LoanApprovalHandler {
    public void approvePersonalLoan(PersonalLoanValidator validator) {
        if (validator.isValid()) {
            // process of the loan
        }
    }
    public void approveVehicleLoan(VehicleLoanValidator validator) {
        if (validator.isValid()) {
            // process of the loan
        }
    }
}


class PersonalLoanValidator {
    public boolean isValid() {
        return true;
    }
}

class VehicleLoanValidator {
    public boolean isValid() {
        return true;
    }
}