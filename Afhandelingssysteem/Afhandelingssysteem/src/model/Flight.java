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
    
    public Flight(int luggageID) {
        data = manager.getFlightData(luggageID);
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
