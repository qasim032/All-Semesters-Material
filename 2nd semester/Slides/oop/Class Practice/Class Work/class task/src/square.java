import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a num ");
        int num = input.nextInt();
        int square = num * num;
        if ( num > 0) {
            System.out.println("Square of the number is " + square);
        }else {
            System.out.println("Invalid input");
        }
    }
}
