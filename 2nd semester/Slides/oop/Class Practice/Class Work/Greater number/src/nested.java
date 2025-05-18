import java.util.Scanner;

public class nested {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter  number ");
        int num = input.nextInt();
        if (num == 0){
            System.out.println("The number is zero");
        }
        else if(num%2==0){
            System.out.println("The number is even");
        }else {
            System.out.println("The number is odd");
        }

    }
}
