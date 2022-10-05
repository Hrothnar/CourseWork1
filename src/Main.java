public class Main {
    private final static Employee[] PERSON = new Employee[50];

    public static void main(String[] args) {
        PERSON[0] = new Employee("Чернов Борис Валентинович", 3, 34400);
        PERSON[1] = new Employee("Епифанцев Виктор Николаевич", 2, 42500);
        PERSON[2] = new Employee("Купченко Наталья Викторовна", 1, 31600);
        PERSON[3] = new Employee("Онищенко Ольга Юлиановна", 1, 45700);
        PERSON[4] = new Employee("Пожарский Сергей Витальевич", 5, 14200);
        PERSON[5] = new Employee("Захаров Егор Александрович", 4, 28000);
        PERSON[6] = new Employee("Хилат Ирина Львовна", 3, 38300);
        PERSON[13] = new Employee("Кравченко Василий Андреевич", 3, 33300);
        PERSON[4].setSalary(39700);
        PERSON[2].setDivision(2);
        personInfo();
        System.out.println();
        System.out.println("Сумма зарплат всех сотрудников: " + sumSalary() + " руб.");
        System.out.println();
        maxSalary();
        System.out.println();
        minSalary();
        System.out.println();
        averageSalary();
        System.out.println();
        nameList();
    }

    private static void personInfo() {
        for (Employee employee : PERSON) {
            if (employee != null) { //не вывожу null, т.е если ячейка не имеет значения
                System.out.println(employee);
            }
        }
    }

    private static int sumSalary() {
        int sum = 0;
        for (Employee employee : PERSON) {
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }

    private static void maxSalary() {
        int max = Integer.MIN_VALUE;
        int j = 0;
        for (int i = 0; i < PERSON.length; i++) {
            if (PERSON[i] != null && max < PERSON[i].getSalary()) {
                max = PERSON[i].getSalary();
                j = i;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + PERSON[j]);
    }

    private static void minSalary() {
        int min = Integer.MAX_VALUE;
        int j = 0;
        for (int i = 0; i < PERSON.length; i++) {
            if (PERSON[i] != null && min > PERSON[i].getSalary()) {
                min = PERSON[i].getSalary();
                j = i;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + PERSON[j]);
    }

    private static void averageSalary() {
        int sum = 0;
        int j = 0;
        for (Employee employee : PERSON) {
            if (employee != null) {
                sum = sum + employee.getSalary();
                j++;
            }
        }
        System.out.println("Средняя зарплата сотрудников: " + (double) sum / j + " руб.");
    }

    private static void nameList() {
        System.out.println("Список сотрудников: ");
        for (Employee employee : PERSON) {
            if (employee != null) {
                System.out.println(employee.getName());
            }
        }
    }
}