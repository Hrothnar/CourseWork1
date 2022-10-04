public class Main {
    private final static Employee[] person = new Employee[60];

    public static void main(String[] args) {
        outPut(person);
    }

    public static void outPut(Employee[] person) {
        person[0] = new Employee("Чернов Борис Валентинович", 3, 34400);
        person[1] = new Employee("Епифанцев Виктор Николаевич", 2, 42500);
        person[2] = new Employee("Купченко Наталья Викторовна", 1, 31600);
        person[3] = new Employee("Онищенко Ольга Юлиановна", 1, 45700);
        person[4] = new Employee("Пожарский Сергей Витальевич", 5, 14200);
        person[5] = new Employee("Захаров Егор Александрович", 4, 28000);
        person[6] = new Employee("Хилат Ирина Львовна", 3, 38300);
        person[4].setSalary(39700);
        person[2].setDivision(2);
        personInfo();
        System.out.println();
        sumSalary();
        System.out.println();
        minSalary(checkMinSalary());
        System.out.println();
        maxSalary(checkMaxSalary());
        System.out.println();
        averageSalary();
        System.out.println();
        nameList();
    }

    public static void personInfo() {
        for (Employee i : person) {
            if (i != null) {
                System.out.println(i);
            }
        }
    }

    public static void sumSalary() {
        int sum = 0;
        for (int i = 0; person[i] != null; i++) {
            sum = sum + person[i].getSalary();
        }
        System.out.println("Сумма зарплат: " + sum + " руб.");
    }

    public static int checkMinSalary() {
        int min = Integer.MAX_VALUE;
        int i = 0;
        for (; person[i] != null; i++) {
            if (min > person[i].getSalary()) {
                min = person[i].getSalary();
            }
        }
        return min;
    }

    public static void minSalary(int min) {
        int i = 0;
        for (; person[i] != null; i++) {
            if (min == person[i].getSalary()) {
                System.out.println("Сотрудник с минимальной зарплатой: " + person[i]);
            }
        }
    }

    public static int checkMaxSalary() {
        int max = Integer.MIN_VALUE;
        int i = 0;
        for (; person[i] != null; i++) {
            if (max < person[i].getSalary()) {
                max = person[i].getSalary();
            }
        }
        return max;
    }

    public static void maxSalary(int max) {
        int i = 0;
        for (; person[i] != null; i++) {
            if (max == person[i].getSalary()) {
                System.out.println("Сотрудник с максимальной зарплатой: " + person[i]);
            }
        }
    }

    public static void averageSalary() {
        int sum = 0;
        int i = 0;
        for (; person[i] != null; i++) {
            sum = sum + person[i].getSalary();
        }
        System.out.println("Средняя зарплата сотрудников: " + sum / i + " руб.");
    }

    public static void nameList() {
        System.out.println("Список сотрудников: ");
        for (int i = 0; person[i] != null; i++) {
            System.out.println(person[i].getName());
        }
    }
}