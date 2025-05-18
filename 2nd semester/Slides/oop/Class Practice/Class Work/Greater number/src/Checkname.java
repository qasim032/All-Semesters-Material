import java.util.Scanner;

public class Checkname {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "qasim";
        System.out.println("Please enter your name ");
        String nameInp = input.nextLine();
        if (name .equals(nameInp) ) {
            System.out.println("The name was found ");
        } else {
            System.out.println("The name was not found ");
        }

    }
}

