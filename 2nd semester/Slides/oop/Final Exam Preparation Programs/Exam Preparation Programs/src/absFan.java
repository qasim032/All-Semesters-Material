abstract class absFan {
    abstract void on();
    abstract void Off();
}

class Button extends absFan {

    @Override
    void on() {
        System.out.println("The fan is on");
    }

    @Override
    void Off() {
        System.out.println("The fan is off");
    }


    public static void main(String[] args) {
        Button ob = new Button();
        ob.on();
        ob.Off();

    }
}