package com.android.tms.documents;

import java.util.Date;

public class EmployeeContract extends DocumentTemplate {
    public Date contractExpirationDate;
    public String employeeName;


    public EmployeeContract(long documentNumber, Date documentDate, Date contractExpirationDate, String employeeName) {
        super(documentNumber, documentDate);
        this.contractExpirationDate = contractExpirationDate;
        this.employeeName = employeeName;

    }

    public EmployeeContract() {
    }

    @Override
    public String toString() {
        return super.toString() + "||| Expiration date: " + contractExpirationDate + "; Employee name: " + employeeName + " |||";
    }
}
