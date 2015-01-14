package model;

import Main.Main;
import connection.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author IS104_2
 */
public class Employee extends Main {
    EmployeeManager manager = new EmployeeManager();
    public ResultSet data;
    
    private int id = -1;
    
    public Employee() {
        
    }
    
    public Employee(int employeeNumber) {
        data = manager.getEmployee(employeeNumber);
        id = employeeNumber;
    }
    
    /**
     * Get the employee number
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
     * Get the password of the employee (Database version)
     * @return
     * @throws SQLException 
     */
    public String getPassword() throws SQLException {
        return data.getString("password");
    }
    
    /**
     * Get the username of the employee
     * @return
     * @throws SQLException 
     */
    public String getUsername() throws SQLException {
        return data.getString("username");
    }
    
    /**
     * Get the first name of the employee
     * @return
     * @throws SQLException 
     */
    public String getName() throws SQLException {
        return data.getString("name");
    }
    
    /**
     * Get the insertion of the employee
     * @return
     * @throws SQLException 
     */
    public String getInsertion() throws SQLException {
        return data.getString("insertion");
    }
    
    public String getLastName() throws SQLException {
        return data.getString("last_name");
    }
    
    public String getLocation() throws SQLException {
        return data.getString("location");
    }
    
    public int getEmployeeNumber() throws SQLException { 
        return data.getInt("employee_number");
    }
    
    public int getFunction() throws SQLException {
        return data.getInt("function");
    }
    
    public boolean usernameInUse(String username) {
        return manager.findUsername(username);
    }
    
    public String getFunctionName(int functionId) {
        String functionName = "";
        
        switch (functionId) {
            case Main.FUNCTION_EMPLOYEE:
                functionName = "Employee";
                break;

            case Main.FUNCTION_MANAGER:
                functionName = "Manager";
                break;

            case Main.FUNCTION_APP_MANAGER:
                functionName = "Administrator";
                break;

            default:
                functionName = "Unknown";
                break;
        }
        
        return functionName;
    }
    
}
