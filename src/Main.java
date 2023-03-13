public class Main {

    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        Employee a = new Employee("Агламзянов Александр Сергеевич", 1, 65_000.45);
        Employee b = new Employee("Аксёненко Андрей Николаевич", 2, 64_200.40);
        Employee c = new Employee("Гимадеева Ольга Викторовна", 3, 54_500.70);
        Employee d = new Employee("Конради Ирина Ниловна", 4, 47_800.20);
        Employee e = new Employee("Исаева Олеся Ивановна", 3, 54_700.60);
        Employee f = new Employee("Клименко Екатерина Александровна", 5, 60_500.90);
        Employee g = new Employee("Нефедовский Денис Николаевич", 1, 89_950.40);
        Employee h = new Employee("Игнатьева Светлана Николаевна", 4, 50_600.20);
        Employee i = new Employee("Ерофеев Владимир Германович", 2, 65_700.20);
        Employee j = new Employee("Медная Юлия Александровна", 5, 61_500.60);
        employees[0] = a;
        employees[1] = b;
        employees[2] = c;
        employees[3] = d;
        employees[4] = e;
        employees[5] = f;
        employees[6] = g;
        employees[7] = h;
        employees[8] = i;
        employees[9] = j;
        System.out.println("Задание (a) ");
        getOfAllEmployees();
        calcAmountSalary();
        calculateAverageValue();
        System.out.println("Задание (b) ");
        System.out.println("Сумма затрат на зарплату в месяц  " + calcAmountSalary());
        System.out.println("Задание (c) ");
        System.out.println("Минимальная зарплата: " + findMinSalary(employees));
        System.out.println("Задание (d) ");
        System.out.println("Максимальная зарплата: " + findMaxSalary(employees));
        System.out.println("Задание (e) ");
        System.out.println("Среднее значение зарплат: " + calculateAverageValue());
        System.out.println("Задание (f) ");
        System.out.println("ФИО сотрудников: " );
        printFullNameEmployees(employees);
    }
    public static void getOfAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.toString());// Распечатать список всех сотрудников со всеми данными
        }
    }
    public static double calcAmountSalary() {
        double amount = 0;
        for (Employee employee : employees) {
            amount += employee.getSalary();
        }
        return amount;
    }
    public static Employee findMinSalary(Employee[] employees) {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }
    public static Employee findMaxSalary(Employee[] employees) {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }
    public static double calculateAverageValue() {
        return calcAmountSalary() / employees.length;
    }
    public static void printFullNameEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}