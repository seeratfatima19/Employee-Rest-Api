package Resources;

import javax.ws.rs.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.*;

import DB.DbDriver;
import Employee.Employee;


@Path("/resources")
public class ResourcesApi {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/get-employees")
    public List<Employee> getEmployees() {

        try {
            return DbDriver.getAllEmployees();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}
