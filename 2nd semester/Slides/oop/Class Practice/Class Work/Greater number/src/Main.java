import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Our program ");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first number ");
        int num1 = input.nextInt();
        System.out.print("Please enter Second number ");
        int num2 = input.nextInt();
        if (num1 == num2) {
            System.out.println("The numbers are equal");
        } else if (num1 > num2) {
            System.out.println(num1+" is greater than"+ num2);
        } else {
            System.out.println(num1+" is less than"+ num2);
        }

    }
}