package Employee;

import Employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmpDAO {

    private List<Employee> employees;
    public EmpDAO() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }
}
