package Question1;

public class Votes {
    private String name;
    private int votes;

    Votes(String name) {
        this.name = name;
        this.votes=0;
    }

    public void addVotes() {
        this.votes++;
    }

    public String getName() {
        return name;
    }

    public int getVotes() {
        return votes;
    }

    public void displayVotes(){
        System.out.println(name+" get "+votes+" votes.");
    }
}
