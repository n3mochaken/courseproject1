public class Employee {
    private static int count;
    private int id;
    private String fullName;

    private int department;
    private int salary;

    public Employee(String fullName, int salary) {
        this.fullName = fullName;
        this.salary = salary;
        id = ++count;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int i) {
        this.salary = salary;

    }

    public void setDepartment(int i) {
        this.department = department;

    }
    @Override
    public String toString() {
        return "ID: " + id + ", ФИО: " + fullName+ ", Отдел: " + department + ", Зарплата: " + salary;
    }
}
