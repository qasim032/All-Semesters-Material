class shape implements ABinterface{
    private double radius;

    public shape(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    public static void main(String[] args) {
        shape circle = new shape(20);
        System.out.println(circle.calculateArea());
    }
}
