/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Main.Main;
import connection.FlightManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author IS104_2
 */
public class Flight extends Main {
    ResultSet data;
    
    FlightManager manager = new FlightManager();
    
<<<<<<< HEAD
<<<<<<< HEAD
    public Flight(int luggageID, String flightNumber) {
        data = manager.getFlightData(luggageID, flightNumber);
=======
=======
    /**
     * gets the luggae id 
     * @param luggageID 
     */
>>>>>>> 7027aaa1caae9aa171ca87e960bfaae977e12cef
    public Flight(int luggageID) {
        data = manager.getFlightData(luggageID);
>>>>>>> 453ec5a2e2e6fecf2f1ae237a3c80af816e53470
    }
    
    /**
     * gets where the plane was departed from
     * @return
     * @throws SQLException 
     */
    public String getDepartedFrom() throws SQLException {
        return data.getString("departed_from");
    }
    
    /**
     * gets where the luggage was lost at
     * @return
     * @throws SQLException 
     */
    public String getLostAt() throws SQLException {
        return data.getString("lost_at");
    }
    
    /**
     * gets where the plane was flying to
     * @return
     * @throws SQLException 
     */
    public String getDestination() throws SQLException {
        return data.getString("destination");
    }
}
