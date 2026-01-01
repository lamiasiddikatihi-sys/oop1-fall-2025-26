


abstract class Employee {
    String empName;
    public Employee(String empName) {
        System.out.println("Employee constructor called");
        this.empName = empName;
    }

    abstract double calculateSalary();
    public void showDetails() {
        System.out.println("Employee name: " + empName);
    }
}
class FullTimeEmployee extends Employee {
    double monthlyPay;
    public FullTimeEmployee(String empName, double monthlyPay) {
        super(empName);
        System.out.println("FullTimeEmployee constructor called");
        this.monthlyPay = monthlyPay;
    }

    @Override
    double calculateSalary() {
        return monthlyPay;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee " + empName + " has a salary of: " + calculateSalary();
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Nezuko", 5000);
        Employee e2 = new FullTimeEmployee("Tanziro", 7000);

        e1.showDetails();
        System.out.println(e1);

        e2.showDetails();
        System.out.println(e2);
    }
}