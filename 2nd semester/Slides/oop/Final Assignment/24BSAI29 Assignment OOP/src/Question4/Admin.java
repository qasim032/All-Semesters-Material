package Question4;

import java.util.Scanner;

class Admin extends Person {
    public Admin(int employeeId, String employeeName, double employeeSalary) {
        super(employeeId, employeeName, employeeSalary);
    }

    @Override
    public double getBonus() {
        return this.employeeSalary * 0.15;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Admin");
        System.out.println("Bonus: " + this.getBonus());
    }
}

class Salesman extends Person {

    public Salesman(int employeeId, String employeeName, double employeeSalary) {
        super(employeeId, employeeName, employeeSalary);
    }

    @Override
    public double getBonus() {
        return this.employeeSalary * 0.25;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Salesman");
        System.out.println("Bonus: " + this.getBonus());
    }
}


