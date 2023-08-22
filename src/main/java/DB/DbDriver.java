package DB;
import Employee.Employee;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbDriver {

    public static void getAllEmployees() throws IOException {

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

            }
        }
        catch(Exception e){
            System.out.println("in driver "+ e);
        }

    }

    public static void addEmployee(Employee employee)
    {

    }

}
