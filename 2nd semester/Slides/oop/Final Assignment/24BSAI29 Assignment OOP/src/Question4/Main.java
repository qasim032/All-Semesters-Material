package Question4;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose Employee Type:");
        System.out.println("1. Admin");
        System.out.println("2. Salesman");
        System.out.print("Enter choice (1 or 2): ");
        int choice = input.nextInt();
        Person employee = null;
        System.out.print("Enter the Employee ID: ");
        int id = input.nextInt();
        System.out.print("Enter the Employee Name: ");
        String name = input.next();
        System.out.print("Enter the Salary: ");
        double salary = input.nextDouble();


        if (choice == 1) {
            employee = new Admin(id, name, salary);
        } else if (choice == 2) {
            employee = new Salesman(id, name, salary);
        } else {
            System.out.println("Invalid choice");
        }
        System.out.println();
        System.out.println("Employee Details");
        employee.displayInfo();
    }

}

