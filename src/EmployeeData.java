import java.util.ArrayList;

public class EmployeeData {

    public static ArrayList<Employee> getEmployees() {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("John", "Lennon", "Employee", 27045.78));
        employees.add(new Employee("George", "Harrison", "Employee 2", 50000.00));

        return employees;
    }
}