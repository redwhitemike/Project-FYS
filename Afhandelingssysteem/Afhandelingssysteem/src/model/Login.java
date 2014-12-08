package model;

import connection.*;
import java.sql.*;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * 
 * @author IS104_2
 */
public class Login {
   
    String username;
    String password;
    
    QueryManager manager;

    public Login() {
        manager = new QueryManager();
    }
    
    public void setUsername(String inputUser) {
        username = inputUser;
    }
    
    public void setPassword(String inputPass) {
        password = inputPass;
    }
    
    public boolean isEmpty() {
        return username.isEmpty() || password.isEmpty();
    }
    
    public boolean usernamePasswordMatch() {
        String query = "SELECT COUNT(*) as count FROM User WHERE username = ? AND password = ?";
        ResultSet result = null;
        
        try {
            PreparedStatement statement = manager.Connection.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, DigestUtils.sha512Hex(password));

            statement.execute();
            
            result = statement.getResultSet();
            result.next();
            
            return result.getInt("count") > 0;
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        return false;
    }
    
    public boolean isFound() {
        String query = "SELECT COUNT(*) as count FROM User WHERE username = ?";
        ResultSet result = null;
        
        try {
            PreparedStatement statement = manager.Connection.prepareStatement(query);
            statement.setString(1, username);
            statement.execute();
            
            result = statement.getResultSet();
            result.next();
            
            return result.getInt("count") > 0;
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        return false;
    }
    
    public int getFunction() {
        String query = "SELECT function FROM User WHERE username = ?";
        ResultSet result = null;
        
        try {
            PreparedStatement statement = manager.Connection.prepareStatement(query);
            statement.setString(1, username);
            statement.execute();
            
            result = statement.getResultSet();
            result.next();
            
            return result.getInt("function");
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        return -1;
    }
    
    public boolean doLogin() throws Exception {
        if (!isEmpty()) {
            if (isFound()) {
                if (usernamePasswordMatch()) {
                    return true;
                } else {
                   throw new Exception("Invalid password."); 
                }
            } else {
                throw new Exception("The user is not found.");
            }
        } else {
            throw new Exception("Username or password is missing.");
        }
    }
    
}
