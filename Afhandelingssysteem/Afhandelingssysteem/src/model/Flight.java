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
    
    /**
     * gets the luggae id 
     * @param luggageID 
     */
    public Flight(int luggageID) {
        data = manager.getFlightData(luggageID);
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
