import java.util.Scanner;

public class Javaclass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of classes held : ");
        int classesHeld = input.nextInt();
        System.out.print("Number of classes attend ");
        int attend = input.nextInt();

        float per = ((float) attend / classesHeld) * 100;
//        System.out.println("Percentage of class attended " + (int)(per * 100) / 100f + "%");
        System.out.println("Percentage of class attended " + per + "%");
        if (per < 75) {
            System.out.println("You are not allowed to sit in exam");
        } else {
            System.out.println("You are allowed to sit in exam ");
        }

    }
}
