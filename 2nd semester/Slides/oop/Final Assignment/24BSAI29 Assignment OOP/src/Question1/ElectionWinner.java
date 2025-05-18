package Question1;

import java.util.Scanner;

public class ElectionWinner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Votes Taha = new Votes("Taha");
        Votes Saim = new Votes("Saim");
        char ch;

        do {
            System.out.println("1 " + Taha.getName());
            System.out.println("2 " + Saim.getName());
            System.out.println("Select the candidate you want to vote");
            int candidateNo = input.nextInt();
            if (candidateNo == 1) {
                Taha.addVotes();
                System.out.println("Vote added.");
            } else if (candidateNo == 2) {
                Saim.addVotes();
                System.out.println("Vote added.");
            } else {
                System.out.println("Invalid choice.");
            }
            System.out.println("press s to see the winner or press Any key to continue voting.");
            ch = input.next().charAt(0);


        } while (ch != 's' && ch != 'S');
        Taha.displayVotes();
        Saim.displayVotes();
        if (Taha.getVotes()> Saim.getVotes()){
            System.out.println(Taha.getName()+" is the winner.");
        } else if (Saim.getVotes()> Taha.getVotes()) {
            System.out.println(Saim.getName()+" is the winner.");
        }else {
            System.out.println("It is a tie.");
        }

    }
}
