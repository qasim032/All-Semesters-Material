//Task 1
public class Main {

    public static void main(String[] args) {
        int[] a = {1, 4, 2, 5};
        int arraySum = 0;
        for (int i = 0; i < a.length; i++) {
            arraySum = arraySum + a[i];
        }
        int sum2 = 0;
        for(int i = 1;i<=5;i++){
            sum2 = sum2+i;
        }
        System.out.println("The missing number is "+(sum2-arraySum));

    }
}