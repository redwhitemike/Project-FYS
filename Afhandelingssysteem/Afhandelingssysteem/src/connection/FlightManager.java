/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author Youssri
 */
public class FlightManager extends QueryManager {
    public ResultSet getCustomerLuggage(int customerId) {
        String query = "SELECT Luggage.* FROM Luggage INNER JOIN Flight ON Luggage.label_number = Flight.luggage_id INNER JOIN Customer ON Customer.customer_id = Flight.customer_id WHERE Customer.customer_id = ?";
        ResultSet flightData = null;
        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setInt(1, customerId);
            statement.execute();
            flightData = statement.getResultSet();
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        return flightData;
    }
}
