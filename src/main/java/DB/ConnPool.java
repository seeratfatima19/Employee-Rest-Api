package DB;

import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Properties;

public class ConnPool {
    Connection conn;
    Statement stmt;
    private static String url="jdbc:mysql://localhost:3306/employee";

    private static HikariDataSource ds;

    static {

        try{

            ds = new HikariDataSource();
            ds.setDriverClassName("com.mysql.jdbc.Driver");
            ds.setJdbcUrl(url);
            ds.setUsername("root");
            ds.setPassword("root");
            ds.setMaximumPoolSize(50);
            ds.setMinimumIdle(5);
        }
        catch(Exception e){
            System.out.println("In conn pool "+ e);
        }

    }

    public static DataSource getDataSource() {
        return ds;
    }
}
