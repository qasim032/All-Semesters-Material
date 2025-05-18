class Programmer {
    private String name;

    // Getter and Setter for name
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
class Name {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.setName("Qasim");
        System.out.println("Name=> " + p.getName());
    }
}