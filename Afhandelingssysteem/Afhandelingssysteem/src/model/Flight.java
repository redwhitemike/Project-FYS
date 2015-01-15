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
 * @author Youssri
 */
public class Flight extends Main {
    ResultSet data;
    
    FlightManager manager = new FlightManager();
    
<<<<<<< HEAD
    public Flight(int luggageID, String flightNumber) {
        data = manager.getFlightData(luggageID, flightNumber);
=======
    public Flight(int luggageID) {
        data = manager.getFlightData(luggageID);
>>>>>>> 453ec5a2e2e6fecf2f1ae237a3c80af816e53470
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
}
