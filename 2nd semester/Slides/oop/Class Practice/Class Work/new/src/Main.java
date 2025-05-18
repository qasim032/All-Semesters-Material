public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Welcome to salary calculator ");
        int salary = 50000;
        int bonus = 7500;
        int totalSalary = salary + bonus;
        System.out.println("The total salary of employee is " + totalSalary);

        // Task 2
        int perfScore = 85;
        int passingScore = 75;
        int service = 2;

        if (perfScore > passingScore && service >= 2) {
            System.out.println("You can be promoted");
        }

        // Task 3
        int originalSalary = 50000;
        int tax = (int) (originalSalary * 0.10);
        int finalSalary = originalSalary - tax;
        System.out.println("The final salary after tax is: " + finalSalary);

        // Task 4
        int leave = 10;
        leave--; // Taking the leave
        leave++; // Extra work
        System.out.println("Leaves remaining: " + leave);

        
    }
}



