
public class EmployeeBook {
    private final Employee[] employees = new Employee[50];

    public void personInfo() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public int sumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }

    public void maxSalary() {
        int max = Integer.MIN_VALUE;
        int j = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && max < employees[i].getSalary()) {
                max = employees[i].getSalary();
                j = i;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + employees[j]);
    }

    public void minSalary() {
        int min = Integer.MAX_VALUE;
        int j = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && min > employees[i].getSalary()) {
                min = employees[i].getSalary();
                j = i;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + employees[j]);
    }

    public void averageSalary() {
        int sum = 0;
        int j = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum = sum + employee.getSalary();
                j++;
            }
        }
        System.out.println("Средняя зарплата сотрудников: " + (double) sum / j + " руб.");
    }

    public void nameList() {
        System.out.println("Список сотрудников: ");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getName());
            }
        }
    }

    public void indexingSalary(double index) {
        for (Employee employee : employees) {
            if (employee != null) {
                double salaryAfter = employee.getSalary() * index;
                System.out.println("После индексации, зарплата сотрудника " + employee.getName() + " равна: " + salaryAfter + " руб.");
            }
        }
    }

    public void minSalaryInDivision(int division) {
        int min = Integer.MAX_VALUE;
        int j = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && min > employees[i].getSalary() && employees[i].getDivision() == division) {
                min = employees[i].getSalary();
                j = i;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой в отделе " + division + ": " + employees[j]);
    }

    public void maxSalaryInDivision(int division) {
        int max = Integer.MIN_VALUE;
        int j = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && max < employees[i].getSalary() && employees[i].getDivision() == division) {
                max = employees[i].getSalary();
                j = i;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой в отделе " + division + ": " + employees[j]);
    }

    public int sumSalaryInDivision(int division) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDivision() == division) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }

    public void averageSalaryInDivision(int division) {
        int sum = 0;
        int j = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDivision() == division) {
                sum = sum + employee.getSalary();
                j++;
            }
        }
        System.out.println("Средняя зарплата сотрудников в отделе " + division + ": " + (double) sum / j + " руб.");
    }

    public void indexingSalaryInDivision(int division, double index) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDivision() == division) {
                double salaryAfter = employee.getSalary() * index;
                System.out.println("После индексации, зарплата сотрудника из отдела " + division + " " + employee.getName() + " равна: " + salaryAfter + " руб.");
            }
        }
    }

    public void personInfoInDivision(int division) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDivision() == division) {
                System.out.println("Данные на сотрудника, " + division + " отдел:" + "ID: " + employee.getId() + " Имя: " + employee.getName() + " Зарплата: " + employee.getSalary());
            }
        }
    }

    public void salaryLevel(int line) {
        for (Employee employee : employees) {
            if (employee != null && line <= employee.getSalary()) {
                System.out.println("У сотрудника " + " ID: " + employee.getId() + "   Ф.И.О.: " + employee.getName() + "   Зарплата: " + employee.getSalary() + " больше " + line + " руб.");
            }
        }
        System.out.println();
        for (Employee employee : employees) {
            if (employee != null && line >= employee.getSalary()) {
                System.out.println("У сотрудника " + " ID: " + employee.getId() + "   Ф.И.О.: " + employee.getName() + "   Зарплата: " + employee.getSalary() + " меньше " + line + " руб.");
            }
        }
    }

    public void addEmployees(Employee someone) {
        boolean j = false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = someone;
                j = true;
                break;
            }
        }
        if (!j) {
            throw new RuntimeException("Превышен лимит работников, пожалуйста увольте кого-нибудь или расширьте штат.");
        }
    }

    public void removeEmployee(String name, int id) {
        for (int i = 0; i < employees.length; i++) {
            if (name != null || id != 0) {
                if (employees[i].getName().equals(name) || id == employees[i].getId()) {
                    employees[i] = null;
                    break;
                }
            }
        }
    }

    public void changeEmployee(String name, int division, int salary) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name) && (division != 0 || salary != 0)) {
                if (division != 0 && salary != 0) {
                    employee.setDivision(division);
                    employee.setSalary(salary);
                    break;
                } else if (division == 0) {
                    employee.setSalary(salary);
                    break;
                } else {
                    employee.setDivision(division);
                    break;
                }
            }
        }
    }

    public void compositionOfDivision() {
        System.out.println("Персонал по отделам: ");
        for (Employee employee : employees) {
            if (employee != null && employee.getDivision() == 1) {
                System.out.println(employee);
            }
        }
        for (Employee employee : employees) {
            if (employee != null && employee.getDivision() == 2) {
                System.out.println(employee);
            }
        }
        for (Employee employee : employees) {
            if (employee != null && employee.getDivision() == 3) {
                System.out.println(employee);
            }
        }
        for (Employee employee : employees) {
            if (employee != null && employee.getDivision() == 4) {
                System.out.println(employee);
            }
        }
        for (Employee employee : employees) {
            if (employee != null && employee.getDivision() == 5) {
                System.out.println(employee);
            }
        }
    }
}
