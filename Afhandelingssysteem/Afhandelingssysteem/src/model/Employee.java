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
    ResultSet data;
    
    private int id = -1;
    
    public Employee() {
        
    }
    
    public Employee(int userId) {
        data = manager.getEmployee(userId);
        id = userId;
    }
    
    public int getId() {
        return id;
    }

    public int getFunction() throws Exception {
        return data.getInt("function");
    }
    
    public boolean usernameInUse(String username) {
        return manager.findUsername(username);
    }
    
}
