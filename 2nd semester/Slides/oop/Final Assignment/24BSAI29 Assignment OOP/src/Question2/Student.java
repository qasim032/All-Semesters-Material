package Question2;

public class Student {
    private String rollNo;
    private String name;
    private int marksInOop;

    Student(String name, String rollno, int marksInOop) {
        this.rollNo = rollno;
        this.name = name;
        this.marksInOop = marksInOop;
    }

    public String getRollNo() {
        return this.rollNo;
    }

    public void displayInfo() {
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Name: " + this.name);
        System.out.println("MarksInOOP: "+this.marksInOop);
    }
}
