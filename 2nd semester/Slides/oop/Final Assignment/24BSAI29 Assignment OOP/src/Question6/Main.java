package Question6;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Company company = new Company();
        System.out.print("Enter Employee ID: ");
        company.setEmpId(input.nextInt());

        System.out.print("Enter Employee Name: ");
        company.setEmpName(input.next());

        System.out.print("Enter Employee Address: ");
        company.setEmpAddress(input.next());

        System.out.print("Enter Employee Department: ");
        company.setEmpDept(input.next());

        System.out.print("Enter Employee Phone: ");
        company.setEmpPhone(input.nextInt());

        System.out.print("Enter Employee Age: ");
        company.setEmpAge(input.nextInt());



        System.out.println();
        System.out.println("Employee Details:");
        System.out.println("Employee ID: " + company.getEmpId());
        System.out.println("Employee Name: " + company.getEmpName());
        System.out.println("Employee Address: " + company.getEmpAddress());
        System.out.println("Employee Department: " + company.getEmpDept());
        System.out.println("Employee Phone: " + company.getEmpPhone());
        System.out.println("Employee Age: " + company.getEmpAge());
    }
}
