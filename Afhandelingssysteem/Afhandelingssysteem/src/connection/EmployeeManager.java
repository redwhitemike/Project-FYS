package connection;

import Main.Main;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author IS104_2
 */
public class EmployeeManager extends QueryManager {
    
    public EmployeeManager() {
        
    }
    
    /**
     * Adds a new employee to the database.
     * @param values
     */
    public void addEmployee(HashMap<String, Object> values) {
        String query = "INSERT INTO User VALUES(null, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setString(1, values.get("Username").toString());
            statement.setString(2, values.get("Password").toString());
            statement.setString(3, values.get("FirstName").toString());
            statement.setString(4, values.get("Insertion").toString());
            statement.setString(5, values.get("LastName").toString());
            statement.setString(6, values.get("Location").toString());
            statement.setInt(7, Integer.parseInt(values.get("EmployeeNumber").toString()));
            statement.setInt(8, Integer.parseInt(values.get("Function").toString()));
            statement.execute();
        } catch (SQLException e) {
            Main.exceptionPrint(e);
        }
    }
    
    /**
     * Edits an existing employee based on employee number.
     * @param employeeNumber
     * @param values
     */
    public void editEmployee(int employeeNumber, HashMap<String, Object> values) {
        String query = "UPDATE User SET username = ?, password = ?, name = ?, instertion = ?, last_name = ?, location = ?, function = ? WHERE employee_number = ?";
        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setString(1, values.get("Username").toString());
            statement.setString(2, values.get("Password").toString());
            statement.setString(3, values.get("FirstName").toString());
            statement.setString(4, values.get("Insertion").toString());
            statement.setString(5, values.get("LastName").toString());
            statement.setString(6, values.get("Location").toString());
            statement.setInt(7, Integer.parseInt(values.get("Function").toString()));
            statement.setInt(8, employeeNumber);
            statement.execute();
        } catch (SQLException e) {
            Main.exceptionPrint(e);
        }
    }
    
    /**
     * Get employee from the database.
     * @param employeeNumber
     * @return 
     */
    public ResultSet getEmployee(int employeeNumber) {
        ResultSet result = null;
        String query = "SELECT * FROM User WHERE employee_number = ?";
        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setInt(1, employeeNumber);
            statement.execute();
            result = statement.getResultSet();
            result.next();
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        return result;
    }
    
    /**
     * Get all employees.
     * @return 
     */
    public ResultSet getEmployees() {
        String query = "SELECT * FROM User";
        ResultSet result = Database.execute(query);
        return result;
    }
    
    /**
     * Get all employees.
     * @return 
     */
    public ResultSet getEmployees(String filter) {
        String query = "SELECT * FROM User WHERE username LIKE ?";
        ResultSet result = null;
        
        filter = "%" + filter + "%";
        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setString(1, filter);
            statement.execute();
            
            result = statement.getResultSet();
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        return result;
    }
    
    /**
     * Deletes an employee from the database.
     * @param employeeNumber 
     */
    public void deleteEmployee(int employeeNumber) {
        String query = "DELETE FROM User WHERE employee_number = ?";
        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setInt(1, employeeNumber);
            statement.execute();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    
    public boolean findUsername(String name) {
         String query = "SELECT COUNT(*) as count FROM User WHERE username = ?";
        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setString(1, name);
            statement.execute();
            
            ResultSet result = statement.getResultSet();
            result.next();
            
            return result.getInt("count") > 0;
        } catch (SQLException e) {
            Main.exceptionPrint(e);
        }       
        
        return false;
    }
}
