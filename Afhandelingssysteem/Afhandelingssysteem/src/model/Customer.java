package model;


import Main.Main;
import connection.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * geta all the information out of the database about a customer
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
/**
 * get customer id out of the database
 * @return
 * @throws SQLException 
 */
    public int getId() throws SQLException {
        return data.getInt("customer_id");
    }
    
/**
 * gets first name out the database
 * @return
 * @throws SQLException 
 */
    public String getFirstName() throws SQLException {
        return data.getString("first_name");
    }

/**
 * gets last name out of the database
 * @return
 * @throws SQLException 
 */    
    public String getLastName() throws SQLException {
        return data.getString("last_name");
    }
    
/**
 * gets home address out of the database
 * @return
 * @throws SQLException 
 */    
    public String getHomeAddress() throws SQLException {
        return data.getString("home_address");
    }

/**
 * gets the address where the customer is staying on vacation out the database
 * @return
 * @throws SQLException 
 */
    public String getStayAddress() throws SQLException {
        return data.getString("stay_address");
    }
    
/**
 * gets the zipcode out of the database
 * @return
 * @throws SQLException 
 */    
    public String getZipcode() throws SQLException {
        return data.getString("postcode");
    }
    
/**
 * get the country where the costumer is staying right now out of the database
 * @return
 * @throws SQLException 
 */    
    public String getCountry() throws SQLException {
        return data.getString("country");
    }
    
/**
 * gets the city the costumer is staying in out of the database
 * @return
 * @throws SQLException 
 */    
    public String getCity() throws SQLException {
        return data.getString("city");
    }
    
/**
 * gets the phone number out of the database
 * @return
 * @throws SQLException 
 */    
    public String getPhone() throws SQLException {
        return data.getString("phone_number");
    }

/**
 * get the email out of the database
 * @return
 * @throws SQLException 
 */    
    public String getEmail() throws SQLException {
        return data.getString("e-mail");
    }

/**
 * gets the label number out of the database
 * @return
 * @throws SQLException 
 */    
    public int getLabelNumber() throws SQLException {
        return data.getInt("flight_number");
    }
    
/**
 * gets where the plane was departed from out of the database
 * @return
 * @throws SQLException 
 */    
    public String getDepartedFrom() throws SQLException {
        return data.getString("departed_from");
    }
    
/**
 * gets the airport it was lost at from the database
 * @return
 * @throws SQLException 
 */    
    public String getLostAt() throws SQLException {
        return data.getString("lost_at");
    }
    
/**
 * gets the destination of the plane out of the database
 * @return
 * @throws SQLException 
 */    
    public String getDestination() throws SQLException {
        return data.getString("destination");
    }
    
/**
 * gets where de luggage was found out of the database
 * @param id
 * @return 
 */    
    public boolean isFound(int id) {
        return manager.findId(id);
    }
    
}
