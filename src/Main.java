import com.android.tms.documents.EmployeeContract;
import com.android.tms.documents.FinancialInvoice;
import com.android.tms.documents.SupplyOfGoodsContract;
import com.android.tms.register.Register;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Designed to simulate system operation
 */
public class Main {
    public static void main(String[] args) {
        SupplyOfGoodsContract supplyOfGoodsContract = new SupplyOfGoodsContract(
                40130001,
                new Date(),
                "Guns",
                199);
        EmployeeContract employeeContract = new EmployeeContract(
                40130002,
                new GregorianCalendar(2020, Calendar.MARCH, 22).getTime(),
                new GregorianCalendar(2022, Calendar.MARCH, 22).getTime(),
                "Jumbo");
        FinancialInvoice financialInvoice = new FinancialInvoice(
                40130003,
                new GregorianCalendar(2021, Calendar.JUNE, 21).getTime(),
                19991.22,
                "DOF11230"
        );

        Register register = new Register();
        register.saveDocumentInRegister(supplyOfGoodsContract);
        register.saveDocumentInRegister(employeeContract);
        register.saveDocumentInRegister(financialInvoice);

        System.out.println(register.getDocumentInfoFromRegister(supplyOfGoodsContract));
        System.out.println(register.getDocumentInfoFromRegister(employeeContract));
        System.out.println(register.getDocumentInfoFromRegister(financialInvoice));
    }
}
