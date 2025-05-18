import java.util.Scanner;

public class largerone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number");
        int num1 = input.nextInt();
        System.out.print("Enter a second number");
        int num2 = input.nextInt();
        if(num1>num2){
            System.out.println("The greater number is "+num1);
        }else {
            System.out.println("The greater number is "+num2);
        }

    }
}
