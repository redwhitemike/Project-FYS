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
    
    private int id;
    
    public Customer(int customerId) {
        data = manager.getCustomer(customerId);
        id = customerId;
    }

    public int getId() {
        return id;
    }
    
    
}
