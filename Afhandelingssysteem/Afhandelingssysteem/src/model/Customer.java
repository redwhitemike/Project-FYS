package model;


import Main.Main;
import connection.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author IS104_2
 */
public class Customer {
    CustomerManager manager = new CustomerManager();
    ResultSet data;
    
    public Customer() {
        
    }
    
    public Customer(int customerId) {
        data = manager.getCustomer(customerId);
    }

    public int getId() throws SQLException {
        return data.getInt("customer_id");
    }
    
    public String getFirstName() throws SQLException {
        return data.getString("first_name");
    }
    
    public String getLastName() throws SQLException {
        return data.getString("last_name");
    }
    
    public String getHomeAddress() throws SQLException {
        return data.getString("home_address");
    }
    
    public String getStayAddress() throws SQLException {
        return data.getString("stay_address");
    }
    
    public String getZipcode() throws SQLException {
        return data.getString("postcode");
    }
    
    public String getCountry() throws SQLException {
        return data.getString("country");
    }
    
    public String getCity() throws SQLException {
        return data.getString("city");
    }
    
    public String getPhone() throws SQLException {
        return data.getString("phone");
    }

    public String getEmail() throws SQLException {
        return data.getString("e-mail");
    }
    
    public int getLabelNumber() throws SQLException {
        return data.getInt("flight_number");
    }
    
    public String getDepartedFrom() throws SQLException {
        return data.getString("departed_from");
    }
    
    public String getLostAt() throws SQLException {
        return data.getString("lost_at");
    }
    
    public String getDestination() throws SQLException {
        return data.getString("destination");
    }
    
    public boolean isFound(int id) {
        return manager.findId(id);
    }
    
}
