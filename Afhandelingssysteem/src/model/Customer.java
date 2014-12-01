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
    
    private final int id;
    
    public Customer(int customerId) {
        data = manager.getCustomer(customerId);
        id = customerId;
    }

    public int getId() {
        return id;
    }
    
    public String getFirstName() throws Exception {
        return data.getString("first_name");
    }
    
    public String getLastName() throws Exception {
        return data.getString("last_name");
    }
    
    public String getEmail() throws Exception {
        return data.getString("e-mail");
    }
    
    public String getCountry() throws Exception {
        return data.getString("country");
    }
    
    public String getCity() throws Exception {
        return data.getString("city");
    }
    
    public int getFlightNumber() throws Exception {
        return data.getInt("flight_number");
    }
    
}
