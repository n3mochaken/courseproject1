public class Main {
    public static Employee[] employeeStorage = new Employee[10];

    public static void addEmployee(Employee employee) {
        for (int i = 0; i < employeeStorage.length; i++) {
            if (employeeStorage[i] == null) {
                employeeStorage[i] = employee;
                break;
            }
        }

    }

    public static void displayAllEmployees() {
        for (Employee employee : employeeStorage) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static double calculateTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employeeStorage) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public static Employee findMinSalaryEmployee() {
        Employee minSalaryEmployee = null;
        for (Employee employee : employeeStorage) {
            if (employee != null && (minSalaryEmployee == null || employee.getSalary() < minSalaryEmployee.getSalary())) {
                    minSalaryEmployee = employee;
                }
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findMaxSalaryEmployee() {
        Employee maxSalaryEmployee = null;
        for (Employee employee : employeeStorage) {
            if (employee != null) {
                if (maxSalaryEmployee == null || employee.getSalary() > maxSalaryEmployee.getSalary()) {
                    maxSalaryEmployee = employee;
                }
            }
        }
        return maxSalaryEmployee;
    }

    public static double calculateAverageSalary() {
        double totalSalary = calculateTotalSalary();
        int employeeCount = 0;
        for (Employee employee : employeeStorage) {
            if (employee != null) {
                employeeCount++;
            }
        }
        if (employeeCount > 0) {
            return totalSalary / employeeCount;
        } else {
            return 0;
        }
    }

    public static String getAllFullNames() {
        StringBuilder names = new StringBuilder();
        for (Employee employee : employeeStorage) {
            if (employee != null) {
                names.append(employee.getFullName()).append(", ");
            }
        }
        if (names.length() > 0) {
            names.delete(names.length() - 2, names.length());
        }
        return names.toString();
    }


    public static void main(String[] args) {
        Employee employee1 = new Employee("Игорь Петрович Саломатин", 10000);
        Employee employee2 = new Employee("Василий Игоревич Петров", 20000);
        Employee employee3 = new Employee("Петр Игоревич Васильев", 30000);
        Employee employee4 = new Employee("Василий Игоревич Смирнов", 40000);
        addEmployee(employee1);
        addEmployee(employee2);
        addEmployee(employee3);
        addEmployee(employee4);
        displayAllEmployees();
        System.out.println(calculateTotalSalary());
        System.out.println("Сумма затрат на зарплаты в месяц: " + calculateTotalSalary());
        System.out.println("Сотрудник с минимальной зарплатой " + findMinSalaryEmployee());
        System.out.println("Сотрудник с максимальной зарплатой  " + findMaxSalaryEmployee());
        System.out.println("Среднее значение зарплат: " + calculateAverageSalary());
        System.out.println("Фио всех сотрудников " + getAllFullNames());
    }


}


