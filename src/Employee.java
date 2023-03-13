
public class Employee {
    private String fullName;
    private static int id = 0;
    private final int numberId;
    private double salary;
    private int department;
    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        Employee.id++;
        this.numberId = Employee.id;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        fullName = fullName;
    }
    public static int getId() {
        return id;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getDepartment() {
        return department;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    @Override
    public String toString() {
        return "id " + this.numberId + "/" +
                " " + fullName + ' ' +
                "/ Зарплата " + salary +
                "/ отдел №: " + department +
                ' ';
    }
}

