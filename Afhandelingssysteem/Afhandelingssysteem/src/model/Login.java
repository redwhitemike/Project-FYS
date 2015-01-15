package model;

import Main.Main;
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
    int employeeId;

    QueryManager manager;

    public Login() {
        manager = new QueryManager();
    }

    /**
     * sets the username to the input from the user
     * @param inputUser 
     */
    public void setUsername(String inputUser) {
        username = inputUser;
    }

    /**
     * gets username
     * @return 
     */
    public String getUsername() {
        return username;
    }

    /**
     * sets the password that he user had put in
     * @param inputPass 
     */
    public void setPassword(String inputPass) {
        password = inputPass;
    }

    /**
     * it returns empty username and password
     * @return 
     */
    public boolean isEmpty() {
        return username.isEmpty() || password.isEmpty();
    }

    /**
     * looks if user input of  the username and the password match with the 
     * database
     * @return 
     */
    public boolean usernamePasswordMatch() {
        String query = "SELECT COUNT(*) as count FROM User WHERE username = ? AND password = ?";
        ResultSet result;

        try {
            PreparedStatement statement = manager.Connection.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, DigestUtils.sha512Hex(password));

            statement.execute();

            result = statement.getResultSet();
            result.next();

            return result.getInt("count") > 0;
        } catch (SQLException e) {
            Main.exceptionPrint(e);
        }

        return false;
    }

    /**
     * looks if the username is found in the database
     * @return 
     */
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
            Main.exceptionPrint(e);
        }

        return false;
    }

    /**
     * gets te employee number
     * @return 
     */
    public Employee getEmployee() {
        String query = "SELECT employee_number FROM User WHERE username = ?";
        ResultSet result = null;

        try {
            PreparedStatement statement = manager.Connection.prepareStatement(query);
            statement.setString(1, username);
            statement.execute();

            result = statement.getResultSet();
            result.next();

            return new Employee(result.getInt("employee_number"));
        } catch (SQLException e) {
            Main.exceptionPrint(e);
        }

        return null;
    }

}
