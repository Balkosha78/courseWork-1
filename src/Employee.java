public class Employee {
    private String firstName;
    private String MiddleName;
    private String LastName;
    private static int id = 0;
    private final int numberId;
    private double salary;
    private int department;
    public Employee(String firstName, String middleName, String lastName, int department, double salary) {
        this.firstName = firstName;
        this.MiddleName = middleName;
        this.LastName = lastName;
        this.department = department;
        this.salary = salary;
        Employee.id++;
        this.numberId = Employee.id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMiddleName() {
        return MiddleName;
    }
    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
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
                " " + firstName + ' ' +
                " " + MiddleName + ' ' +
                " " + LastName + ' ' +
                "/ Зарплата " + salary +
                "/ отдел №: " + department +
                ' ';
    }
}