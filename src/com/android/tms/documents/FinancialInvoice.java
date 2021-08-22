package com.android.tms.documents;

import java.util.Date;

public class FinancialInvoice extends DocumentTemplate {
    public double totalAmountForMonth;
    public String departmentCode;

    public FinancialInvoice(long documentNumber, Date documentDate, double totalAmountForMonth, String departmentCode) {
        super(documentNumber, documentDate);
        this.totalAmountForMonth = totalAmountForMonth;
        this.departmentCode = departmentCode;
    }

    public FinancialInvoice() {
    }

    @Override
    public String toString() {
        return super.toString() + "||| Total amount for the month: " + totalAmountForMonth + "; Department code: " + departmentCode + " |||";
    }
}
