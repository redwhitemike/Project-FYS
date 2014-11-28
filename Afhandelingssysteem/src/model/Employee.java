package model;

import afhandelingssysteem.Afhandelingssysteem;
import connection.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JPanel;

/**
 *
 * @author Team 2
 */
public class Employee extends Afhandelingssysteem {
    EmployeeManager manager = new EmployeeManager();
    ResultSet data;
    
    public Employee(int userId) {
        data = manager.getEmployee(userId);
    }
    
    public int getId() {
        try {
            return data.getInt("userid");
        } catch (SQLException e) {
            System.err.println("Employee.getId: Employee id could not be retrieved.");
        }
        
        return -1;
    }
    
    /**
     * Returns the proper window for the function.
     * @return 
     */
    public JPanel getWindow() {
        int function = -1;
        JPanel functionPanel = null;
        
        try {
            function = data.getInt("function");
        } catch (SQLException e) {
            System.err.println("Employee.showWindow: Error retrieving function");
        }
        
        switch (function) {
            case FUNCTION_CUSTOMER:
                // functionPanel = new CustomerView();
                break;
                
            case FUNCTION_EMPLOYEE:
                // functionPanel = new EmployeeView();
                break;
                
            case FUNCTION_MANAGER:
                // functionPanel = new ManagerView();
                break;
                
            case FUNCTION_APP_MANAGER:
                // functionPanel = new AppManagerView();
                break;
                    
            default:
                System.err.println("Employee.showWindow: Invalid function (-1)");
                break;
        }
        
        return functionPanel;
    }
}
