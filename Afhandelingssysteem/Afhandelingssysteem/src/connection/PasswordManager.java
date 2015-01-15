/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import Main.Main;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Youssri
 */
public class PasswordManager extends QueryManager {
    /**
     * Checks if the combination of username/email appears in the database
     * @param username
     * @param email
     * @return 
     */
    public boolean findUserEmailCombination(String username, String email) {
        String query = "SELECT COUNT(*) as count FROM User WHERE username = ? AND email = ?";
        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, email);
            statement.execute();
            
            ResultSet result = statement.getResultSet();
            result.next();
            
            return result.getInt("count") > 0;
        } catch (SQLException e) {
            Main.exceptionPrint(e);
        }
        
        return false;
    }
    
    /**
     * Returns the id based on the username and email
     * @param username
     * @param email
     * @return 
     */
    public int getIdFromUserEmail(String username, String email) {
        int id = 0;
        
        String query = "SELECT userid FROM User WHERE username = ? AND email = ?";
        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, email);
            statement.execute();
            
            ResultSet result = statement.getResultSet();
            result.next();
            
            id = result.getInt("userid");
        } catch (SQLException e) {
            Main.exceptionPrint(e);
        }
        
        return id;
    }
    
    /**
     * Updates the password
     * @param userid
     * @param newPassword 
     */
    public void updatePassword(int userid, String newPassword) {
        String query = "UPDATE User SET password = ? WHERE userid = ?";
        
        try {
            System.out.println(userid);
            
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setString(1, DigestUtils.sha512Hex(newPassword));
            statement.setInt(2, userid);
            statement.execute();
        } catch (SQLException e) {
            Main.exceptionPrint(e);
        }
    }
    
    /**
     * Checks if the password from the database matches the one that is entered
     * @param userid
     * @param password
     * @return 
     */
    public boolean equals(int userid, String password) {
        String query = "SELECT password FROM User WHERE userid = ?";
        
        try {
            System.out.println(userid);
            
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setInt(1, userid);
            statement.execute();
            
            ResultSet result = statement.getResultSet();
            result.next();
            
            return DigestUtils.sha512Hex(password).equals(result.getString("password"));
        } catch (SQLException e) {
            Main.exceptionPrint(e);
        }
        
        return false;
    }
}
