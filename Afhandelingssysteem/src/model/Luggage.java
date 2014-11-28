package model;

import java.sql.ResultSet;

import afhandelingssysteem.Afhandelingssysteem;
import connection.*;
import java.sql.SQLException;

/**
 *
 * @author Team 2
 */
public class Luggage extends Afhandelingssysteem {
    LuggageManager manager = new LuggageManager();
    ResultSet data;
    
    public Luggage(int labelNumber) {
        data = manager.getLuggage(labelNumber);
    }
    
    public int getLabelNumber() {
        try {
            return data.getInt("label_number");
        } catch (SQLException e) {
            System.err.println("Luggage.getLabelNumber: Label number could not be retrieved.");
        }
        
        return -1;
    }
}
