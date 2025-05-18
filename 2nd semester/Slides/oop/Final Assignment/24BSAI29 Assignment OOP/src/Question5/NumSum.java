package Question5;

import java.util.Scanner;

public class NumSum {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a positive odd number,Should be greater than Second number: ");
        int a = input.nextInt();
        System.out.print("Please enter a second positive even number,Should be less than the first number: ");
        int b = input.nextInt();
        NumSum check = new NumSum();
        int sum = check.SumCal(a, b);
        System.out.println("Sum: "+sum);

    }

    public int SumCal(int a, int b) {

        if (a <= 0 || b <= 0) {
            System.out.println("Both numbers must be greater than 0.");
            return 0;
        }

        if (a % 2 == 0) {
            System.out.println("First number must be ODD.");
            return 0;
        }

        if (b % 2 != 0) {
            System.out.println("Second number must be EVEN.");
            return 0;
        }

        if (a <= b) {
            System.out.println("First number must be GREATER than second number.");
            return 0;
        }

        return a + b;
    }
}
