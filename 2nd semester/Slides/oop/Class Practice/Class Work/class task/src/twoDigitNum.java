import java.util.Scanner;

public class twoDigitNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a num ");
        int num = input.nextInt();

        if(num>9 && num<100){
            System.out.println("The number is a double figure ");
        }else {
            System.out.println("The number is not a double figure ");
        }
    }
}
