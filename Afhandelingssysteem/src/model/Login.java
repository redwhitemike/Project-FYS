package model;

import connection.*;
import java.sql.*;

public class Login {
   
    String username;
    String password;
    
    QueryManager manager;

    public Login(String inputUser, String inputPass) {
        manager = new QueryManager();
        username = inputUser;
        password = inputPass;
    }
    
    public boolean isEmpty() {
        return username.isEmpty() || password.isEmpty();
    }
    
    public boolean isFound() {
        String query = "SELECT COUNT(*) as count FROM User WHERE username = ? AND password = ?";
        ResultSet result = null;
        
        try {
            PreparedStatement statement = manager.Connection.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);
            statement.execute();
            
            result = statement.getResultSet();
            result.next();
            
            return result.getInt("count") > 0;
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        return false;
    }
    
    public boolean doLogin() throws Exception {
        if (!isEmpty()) {
            if (isFound()) {
                return true;
            } else {
                throw new Exception("Invalid username/password.");
            }
        } else {
            throw new Exception("Username or password is missing.");
        }
    }
    
}
