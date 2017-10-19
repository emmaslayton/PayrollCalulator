/* “CalcFutureInvest"
 *
 *  @author Emma Slayton
 *  Created: 10/18/17
 *  Last updated: 10/18/17
 *
 *  Project 4; CSC201-004N
 *  Assignment 4.23
 *
 */

import java.util.Scanner;
public class PayrollCalculator {

    public static void main(String[] args) {

        /*Create a Scanner*/;
        Scanner input = new Scanner(System.in);


        /*Print Title of Program, author info, date of last edit.*/
        System.out.println("");
        System.out.println(" =================================================== ");
        System.out.println(" ==============/                       /============ ");
        System.out.println(" =============/  PAYROLL CALCULATOR   /============= ");
        System.out.println(" ============/                       /============== ");
        System.out.println(" =================================================== ");
        System.out.println(" ==== [By: Emma Slayton, Last edited: 10-18-17] ==== ");
        System.out.println(" =================================================== ");
        System.out.println(" =================================================== ");
        System.out.println("");
        System.out.println("");
        System.out.println("");



        /*Collect values from the user about the payroll they would like to calculate.
        * (e.g., collect name of employee, hours worked weekly, hourly wage, federal tax, and state tax*/
        System.out.println("Enter employee's name, (e.g.,'Smith.'): ");
        String employeeName = input.next(); // get employeeName
        System.out.println("Enter number of hours worked in a week, (e.g.,'10'): ");
        int weeklyHours = input.nextInt(); // get weeklyHours
        System.out.println("Enter hourly pay rate, (e.g., $9.75/hr = '9.75'): ");
        double hourlyPayRate = input.nextDouble(); // get hourlyPayRate
        System.out.println("Enter federal tax withholding rate, (e.g., 20% = '0.20'): ");
        double federalTaxRate = input.nextDouble(); // get federal tax withholding rate
        System.out.println("Enter state tax withholding rate, (e.g., 9% = '0.09'): ");
        double stateTaxRate = input.nextDouble(); // get state tax withholding rate



        /*Defines values that will be used in output that haven't already been defined.*/
        double grossPay = (hourlyPayRate * weeklyHours);
        double federalTaxPercent = (100 * federalTaxRate);
        double stateTaxPercent = (100 * stateTaxRate);
        double federalWithholding = (federalTaxRate * (grossPay));
        double stateWithholding = (stateTaxRate * (grossPay));
        double totalDeduction = (federalWithholding + stateWithholding);
        double netPay = (grossPay - totalDeduction);



        /*Output
        (Print Payroll information based on input values.)*/
        System.out.println("");
        System.out.println("");
        System.out.println("--- " + employeeName + "'s payroll information ---");
        System.out.printf(" Employee Name: %s\n ", employeeName);
        System.out.println("");
        System.out.printf(" Hours worked: %d\n ", weeklyHours);
        System.out.println("");
        System.out.printf(" Pay rate: $%.2f\n", hourlyPayRate);
        System.out.println("");
        System.out.printf(" Gross pay: $%.2f\n", grossPay);
        System.out.println("");
        System.out.println("     Deductions:");
        System.out.printf("         Federal withholding (%f%%): -$%.2f\n ", federalTaxPercent, federalWithholding);
        System.out.println("");
        System.out.printf("         State withholding (%f%%): -$%.2f\n", stateTaxPercent, stateWithholding);
        System.out.println("");
        System.out.printf("         Total deduction: -$%.2f\n", totalDeduction);
        System.out.println("");
        System.out.printf(" Net Pay: $%.2f\n", netPay);
        System.out.println("");
        System.out.println("");

    }
}
