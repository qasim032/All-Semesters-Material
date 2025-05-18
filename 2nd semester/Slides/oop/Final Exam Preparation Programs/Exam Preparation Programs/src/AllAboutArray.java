import java.util.Scanner;

public class AllAboutArray {
    public static void main(String[] args) {
        // Traversing array and sum
        int sum = 0;
        int []array = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i]= input.nextInt();
        }
        for (int i=0;i<array.length;i++) {
            System.out.println(array[i]);
            sum+=array[i];
        }
        System.out.println("The sum of the array is "+sum);


    }
}
