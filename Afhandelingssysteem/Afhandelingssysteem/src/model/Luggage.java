package model;

import java.sql.ResultSet;

import Main.Main;
import connection.*;
import java.sql.SQLException;

/**
 *
 * @author IS104_2
 */
public class Luggage extends Main {

    private ResultSet data;
    private LuggageManager manager = new LuggageManager();
    
    public Luggage() {
        
    }
    
    public Luggage(int labelNumber) {
        data = manager.getLuggage(labelNumber);
    }
    
    public int getLabelNumber() throws SQLException {
        return data.getInt("label_number");
    }
    
    public String getFlightNumber() throws SQLException {
        return data.getString("flight_number");
    }
    
    public double getWeight() throws SQLException {
        return data.getDouble("weight");
    }
    
    public String getColor() throws SQLException {
        return data.getString("color");
    }
    
    public int getType() throws SQLException {
        return data.getInt("type");
    }
    
    public String getDescription() throws SQLException {
        return data.getString("description");
    }
    
    public int getStatus() throws SQLException {
        return data.getInt("status");
    }
    
    public int typeToInt(String type) {
        switch (type) {
            case "Bag":
                return Main.TYPE_BAG;
                
            case "Case":
                return Main.TYPE_CASE;
                
            case "Hand luggage":
                return Main.TYPE_HAND_LUGGAGE;
                
            case "Other":
                return Main.TYPE_OTHER;
                
            default:
                return Main.TYPE_OTHER;
        }
    }
    
    public String typeToString(int type) {
        switch (type) {
            case Main.TYPE_BAG:
                return "Bag";
                
            case Main.TYPE_CASE:
                return "Case";
                
            case Main.TYPE_HAND_LUGGAGE:
                return "Hand luggage";
                
            case Main.TYPE_OTHER:
                return "Other";
                
            default:
                return "Other";
        }
    }
    
    public String getStatusText(int status) {
        String statusText;
                
        switch (status) {
            case Main.LUGGAGE_MISSING:
                statusText = "Missing";
                break;

            case Main.LUGGAGE_FOUND:
                statusText = "Found";
                break;

            default:
                statusText = "Unknown status";
                break;
        }
        
        return statusText;
    }
    
    public int getStatusInteger(String status) {
        int statusValue = -1;
                
        switch (status) {
            case "Missing":
                statusValue = Main.LUGGAGE_MISSING;
                break;

            case "Found":
                statusValue = Main.LUGGAGE_FOUND;
                break;

            default:
                statusValue = -1;
                break;
        }
        
        return statusValue;
    }
}
