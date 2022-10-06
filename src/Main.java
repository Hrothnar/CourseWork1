public class Main {
    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook();
        book.addEmployees(new Employee("Чернов Борис Валентинович", 3, 34400));
        book.addEmployees(new Employee("Епифанцев Виктор Николаевич", 2, 42500));
        book.addEmployees(new Employee("Купченко Наталья Викторовна", 1, 31600));
        book.addEmployees(new Employee("Онищенко Ольга Юлиановна", 1, 45700));
        book.addEmployees(new Employee("Пожарский Сергей Витальевич", 5, 14200));
        book.addEmployees(new Employee("Захаров Егор Александрович", 4, 28000));
        book.addEmployees(new Employee("Хилат Ирина Львовна", 3, 38300));
        book.addEmployees(new Employee("Кравченко Василий Андреевич", 5, 33300));
        book.removeEmployee("Захаров Егор Александрович", 6);
        book.addEmployees(new Employee("Мясников Николай Варфаламеевич", 4, 19900));
        book.changeEmployee("Купченко Наталья Викторовна", 0, 32800);
        book.personInfo();
        System.out.println();
        System.out.println("Сумма зарплат всех сотрудников: " + book.sumSalary() + " руб.");
        System.out.println();
        book.maxSalary();
        System.out.println();
        book.minSalary();
        System.out.println();
        book.averageSalary();
        System.out.println();
        book.nameList();
        System.out.println();
        book.indexingSalary(1.17);
        System.out.println();
        book.minSalaryInDivision(3);
        System.out.println();
        book.maxSalaryInDivision(3);
        System.out.println();
        System.out.println("Сумма зарплат сотрудников в отделе: " + book.sumSalaryInDivision(3) + " руб.");
        System.out.println();
        book.averageSalaryInDivision(3);
        System.out.println();
        book.indexingSalaryInDivision(3, 1.14);
        System.out.println();
        book.personInfoInDivision(3);
        System.out.println();
        book.salaryLevel(35500);
        System.out.println();
        book.compositionOfDivision();
    }
}