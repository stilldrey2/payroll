package payroll;

import java.util.Scanner;

public class mannuh {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the employee designation: ");
        String designation = scanner.nextLine();

        System.out.print("Enter the number of days worked: ");
        int workDays = scanner.nextInt();

        System.out.print("Enter the pay rate: ");
        int payRate = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter the date: ");
        String myDate = scanner.nextLine();

        int basicSal = payRate * workDays;
        int pf = basicSal / 10;
        final int profTax = 200;
        int grossEarn = basicSal;
        int totalDeduct = pf + profTax;
        int netPay = basicSal - totalDeduct;

        System.out.print("Enter the employee number to generate payslip: ");
        int num = scanner.nextInt();

        System.out.println("\t\t\t\t\t\tSHREE KRISHNA CHEMISTS AND DRUGGIST");
        System.out.println("\t\t\t\t\t\t\t\tSALARY MONTH 9 2013");
        System.out.println("\t\tEMP.NO.: " + num + "       EMP.NAME: " + name + "     DESIGNATION:" + designation);
        System.out.println("\t\tDAYS WORKED: " + workDays + "   PAY RATE: " + payRate + "  GEN.DATE:" + myDate);
        System.out.println("\t\t-----------------------------------------------------------------------------");
        System.out.println("\t\tEARNINGS          AMOUNT(R.S)           DEDUCTIONS            AMOUNT(RS)");
        System.out.println("\t\t-----------------------------------------------------------------------------");
        System.out.println("\t\tBASIC PAY         " + basicSal + "          P.F.                   " + pf);
        System.out.println("                                            PROF.TAX               " + profTax);
        System.out.println("\t\t------------------------------------------------------------------------------");
        System.out.println("\t\tGROSS EARN.        " + grossEarn + "         TOTAL DEDUCT.          " + totalDeduct);
        System.out.println("                                             NET PAY                " + netPay);

        scanner.close();
    }
}


	


