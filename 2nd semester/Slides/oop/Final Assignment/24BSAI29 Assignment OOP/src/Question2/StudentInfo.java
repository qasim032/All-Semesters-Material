package Question2;

import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] listOfStudents = new Student[2];

        System.out.println("Please enter the details of 20 students you want to Store.");
        for (int i = 0; i < listOfStudents.length; i++) {
            System.out.println("Student no " + (i + 1) + ":-");
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("RollNO: ");
            String rollno = input.nextLine();
            System.out.print("Marks In OOP :");
            int marksInOop = input.nextInt();
            input.nextLine();

            listOfStudents[i] = new Student(name, rollno, marksInOop);
        }

        System.out.println("1. Display all students");
        System.out.println("2. Display Specific student");
        int num = input.nextInt();
        input.nextLine();
        if (num == 1) {
            for (int i = 0; i < listOfStudents.length; i++) {
                listOfStudents[i].displayInfo();
                System.out.println();
            }
        } else if (num == 2) {
            System.out.println("Enter the RollNo of Student you want to display ");
            String searchRollNo = input.nextLine().trim();
            for (int i = 0; i < listOfStudents.length; i++) {
                if (searchRollNo.equals(listOfStudents[i].getRollNo())) {
                    listOfStudents[i].displayInfo();
                    System.out.println();
                }
            }
        }
    }
}