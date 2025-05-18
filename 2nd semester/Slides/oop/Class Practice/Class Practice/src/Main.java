//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private int rollno;
    public String name;

    public int setRollno() {
        rollno = 6;

    return rollno;
    }
}

class students{

    public static void main(String[] args) {
        Main obj = new Main();

        String name = obj.name = "Ali";
        System.out.println(name);

        System.out.println(obj.setRollno());
    }
}