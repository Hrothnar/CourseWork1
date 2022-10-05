public class Employee {
    private final String name;
    private int division;
    private int salary;
    private static int count = 1;
    private final int id = count;


    public Employee(String name, int division, int salary) {
        this.name = name;
        this.division = division;
        this.salary = salary;
        count++;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public int getDivision() {
        return this.division;
    }

    public void setDivision(int division) {
        this.division = division;

    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Id сотрудника: " + this.id + "|   Ф.И.О: " + this.name + "|   Отдел: " + this.division + "|   Зарплата: " + this.salary + " руб.";
    }
}