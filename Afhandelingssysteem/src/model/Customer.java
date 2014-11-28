package model;


import afhandelingssysteem.Afhandelingssysteem;
import connection.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Team 2
 */
public class Customer {
    CustomerManager manager = new CustomerManager();
    ResultSet data;
    
    public Customer(int customerId) {
        data = manager.getCustomer(customerId);
    }
    
    public int getId() {
        try {
            return data.getInt("customerid");
        } catch (SQLException e) {
            System.err.println("Customer.getId: Customer id could not be retrieved.");
        }
        
        return -1;
    }
}
