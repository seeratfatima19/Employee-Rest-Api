package DB;
import Employee.Employee;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DbDriver {

    public static List<Employee> getAllEmployees() throws IOException {

        List<Employee> employees = new ArrayList<Employee>();
        String query = "select * from employee.emp_data";

        try(Connection conn = ConnPool.getDataSource().getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                System.out.println("=====================================");
                System.out.println("ID: "+ rs.getInt("id"));
                System.out.println("Emp Name: "+ rs.getString("name"));
                System.out.println("Emp Age: "+ rs.getInt("age"));
                System.out.println("City: "+ rs.getString("city"));
                System.out.println("Emp Department: "+ rs.getString("dept"));
                System.out.println("Emp Position: "+ rs.getString("position"));
                System.out.println("=====================================");

                employees.add(new Employee(rs.getString("name"), rs.getInt("age"), rs.getString("city"), rs.getString("id"),  rs.getString("dept"), rs.getString("position")));
            }

            return employees;
        }
        catch(Exception e){
            System.out.println("in driver "+ e);
        }
        return null;
    }

    public static void addEmployee(Employee employee)
    {
        String query = "insert into employee.emp_data values("+employee.getId()+",'"+employee.getName()+"',"+employee.getAge()+",'"+employee.getCity()+"','"+employee.getDepartment()+"','"+employee.getPosition()+"')";
        try(Connection conn = ConnPool.getDataSource().getConnection();
            Statement stmt = conn.createStatement()) {

            stmt.executeUpdate(query);
        }
        catch(Exception e){
            System.out.println("in driver "+ e);
        }
    }

}
