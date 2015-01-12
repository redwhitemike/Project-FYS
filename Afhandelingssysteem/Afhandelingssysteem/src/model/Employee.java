package model;

import Main.Main;
import connection.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JPanel;

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
    
    public int getId() {
        return id;
    }

    public String getPassword() throws SQLException {
        return data.getString("password");
    }
    
    public String getUsername() throws SQLException {
        return data.getString("username");
    }
    
    public String getName() throws SQLException {
        return data.getString("name");
    }
    
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
