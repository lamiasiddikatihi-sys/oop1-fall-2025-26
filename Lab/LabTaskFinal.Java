class Employee {
    private String name;
    private Position position;
    public Employee(String name,Position position) {
        this.name = name;
        this.position = position;
    }
    public String getName() { return name; }
    public Position getPosition() { return position; }
}
class Position {
    private String title;
    private double salary;
    public Position(String title, double salary) {
        this.title = title;
        this.salary = salary;
    }
    public String toString() {
        return title + ", " + salary;
    }
}
class Company {
    private String companyName;
    private Employee[] employees;
    private int count = 0;
    public Company(String companyName, int capacity) {
        this.companyName = companyName;
        employees = new Employee[capacity];
    }
    public void addEmployee(Employee e) {
        if (count < employees.length) {
            employees[count] = e;
            count++;
        }
    }
    public void showEmployees() {
        System.out.println("Company: " + companyName);
        System.out.println("Employees:");
        for (int i = 0; i < count; i++) {
            System.out.println(" - " + employees[i].getName() +
                    " Position: " + employees[i].getPosition());
        }
    }
}
public class LabTaskFinal{
    public static void main(String[] args) {
        Company company = new Company("Tech", 3);
        company.addEmployee(new Employee("Sukuna",
                new Position("Manager",50000)));
        company.addEmployee(new Employee("Tanziro",
                new Position("Developer",40000)));
        company.addEmployee(new Employee("Levi",
                new Position("Designer",30000)));
        company.showEmployees();
    }
}
