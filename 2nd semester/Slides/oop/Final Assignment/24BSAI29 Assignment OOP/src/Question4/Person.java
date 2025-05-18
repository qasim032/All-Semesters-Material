package Question4;

public abstract class Person {
    protected int employeeId;
    protected String employeeName;
    protected double employeeSalary;

    public Person(int employeeId, String employeeName, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    public void displayInfo() {
        System.out.println("Employee Id: " + this.employeeId);
        System.out.println("Name: " + this.employeeName);
        System.out.println("Salary: " + this.employeeSalary);
    }

    public double getBonus() {
        return 0.0;
    }


}

