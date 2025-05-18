package Question3;

import java.util.Scanner;

class EmpPayCalculate extends employee {
    private double grossPay;
    private double netPay;

    EmpPayCalculate(String employeeName, int empId, double basicSalary) {
        super(employeeName, empId, basicSalary);
        this.setGrossPay();
        this.setNetPay();
    }

    public void setGrossPay() {
        double allowance = this.basicSalary * 0.5;//Assuming Allowances to be the 50% of basic pay
        this.grossPay = this.basicSalary + allowance;
    }

    private void setNetPay() {
        double deduction = this.grossPay * 0.1;// Assuming tex detected to be 10%
        this.netPay = this.grossPay - deduction;
    }

    public void displayPayDetails() {
        System.out.println("Employee ID: " + this.empId);
        System.out.println("Employee Name: " + this.employeeName);
        System.out.println("Basic Salary: " + this.basicSalary);
        System.out.println("Gross Pay:" + this.grossPay);
        System.out.println("Net Pay: " + this.netPay);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String employeeName = input.next();
        System.out.print("Enter Employee ID: ");
        int empId = input.nextInt();
        System.out.print("Enter Salary of Employee: ");
        double basicSalary = input.nextDouble();

        EmpPayCalculate employee = new EmpPayCalculate(employeeName, empId, basicSalary);
        employee.displayPayDetails();
    }
}
