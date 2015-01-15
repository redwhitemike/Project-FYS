package connection;

import Main.Main;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.HashMap;

/**
 *
 * @author IS104_2
 */
public class LuggageManager extends QueryManager {
    
    public LuggageManager() {
        
    }
    
    /**
     * Adds luggage to the database.
     * @param values
     */
    public void addLuggage(HashMap<String, Object> values) {
        String query = "INSERT INTO Luggage (label_number, flight_number, weight, color, type, description, status) "
                + "VALUES(?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setInt(1, Integer.parseInt(values.get("LabelNumber").toString()));
            statement.setString(2, values.get("FlightNumber").toString());
            statement.setDouble(3, Double.parseDouble(values.get("Weight").toString()));
            statement.setString(4, values.get("Colour").toString());
            statement.setInt(5, Integer.parseInt(values.get("Type").toString()));
            statement.setString(6, values.get("Description").toString());
            statement.setInt(7, Integer.parseInt(values.get("Status").toString()));

            statement.execute();
        } catch (SQLException e) {
            Main.exceptionPrint(e);
        }
    }
    
    /**
     * Updates the luggage
     * @param label
     * @param values
     */
    public void editLuggage(int label, HashMap<String, Object> values) {
        String query = 
                "UPDATE Luggage SET flight_number = ?, weight = ?, color = ?, type = ?, description = ?, status = ? "
                + "WHERE label_number = ?";

        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setString(1, values.get("FlightNumber").toString());
            statement.setDouble(2, Double.parseDouble(values.get("Weight").toString()));
            statement.setString(3, values.get("Colour").toString());
            statement.setInt(4, Integer.parseInt(values.get("Type").toString()));
            statement.setString(5, values.get("Description").toString());
            statement.setInt(6, Integer.parseInt(values.get("Status").toString()));
            statement.setInt(7, label);
            statement.execute();
        } catch (SQLException e) {
            Main.exceptionPrint(e);
        }
    }
    
    /**
     * Get luggage from the database.
     * @param labelNumber
     * @return 
     */
    public ResultSet getLuggage(int labelNumber) {
        ResultSet result = null;
        String query = "SELECT * FROM Luggage WHERE label_number = ?";
        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setInt(1, labelNumber);
            statement.execute();
            result = statement.getResultSet();
            result.next();
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        return result;
    }
    
    /**
     * Get all luggage.
     * @return 
     */
    public ResultSet getLuggages() {
        String query = "SELECT * FROM Luggage";
        ResultSet result = Database.execute(query);
        return result;
    }
    
    /**
     * Get all the luggage, filtering by the label/flight number
     * @param filter
     * @return 
     */
    public ResultSet getLuggages(String filter) {
        String query = "SELECT * FROM Luggage WHERE label_number = ? OR flight_number = ?";
        ResultSet result = null;
        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setInt(1, Integer.parseInt(filter));
            statement.setInt(2, Integer.parseInt(filter));
            statement.execute();
            
            result = statement.getResultSet();
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        return result;
    }
    
    public ResultSet getLuggagesManager(String query) {
        ResultSet result = null;
        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.execute();
            
            result = statement.getResultSet();
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        return result;
    }
    
    public ResultSet getLuggagesManager(String query, String filter) {
        ResultSet result = null;
        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setInt(1, Integer.parseInt(filter));
            statement.setString(2, filter);
            statement.execute();
            
            result = statement.getResultSet();
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        return result;
    }
    
    /**
     * Deletes luggage from the database.
     * @param labelNumber
     */
    public void deleteLuggage(int labelNumber) {
        String query = "DELETE FROM Luggage WHERE label_number = ?";
        String queryFlight = "DELETE FROM Flight WHERE luggage_id = ?";
        
        try {
<<<<<<< HEAD
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setInt(1, labelNumber);
            statement.execute();
            
            statement = Connection.prepareStatement(queryFlight);
=======
            PreparedStatement statement = Connection.prepareStatement(queryFlight);
            statement.setInt(1, labelNumber);
            statement.execute();
            
            statement = Connection.prepareStatement(query);
>>>>>>> 453ec5a2e2e6fecf2f1ae237a3c80af816e53470
            statement.setInt(1, labelNumber);
            statement.execute();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
<<<<<<< HEAD
=======
    
    /**
     * Get the chart data based on year and status
     * @param year
     * @return 
     */
    public HashMap<Integer, ResultSet> getChartData(int year, int status) {
        ResultSet result = null;
        HashMap<Integer, ResultSet> chartData = new HashMap<>();
        
        for (int month = 1; month <= 12; month++) {
            String query = "SELECT COUNT(*) as count, MONTH(added_at) as month FROM Luggage WHERE YEAR(added_at) = ? AND MONTH(added_at) = ? AND status = " + status;

            try {
                PreparedStatement statement = Connection.prepareStatement(query);
                statement.setInt(1, year);
                statement.setInt(2, month);
                statement.execute();

                result = statement.getResultSet();
                result.next();
                chartData.put(month - 1, result);
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        
        return chartData;
    }
    
    /**
     * Get the missing luggage data based on year
     * @param year
     * @return 
     */
    public HashMap<Integer, ResultSet> getMissingLuggageData(int year) {
        return this.getChartData(year, Main.LUGGAGE_MISSING);
    }
    
    /**
     * Get the found luggage data based on year
     * @param year
     * @return 
     */
    public HashMap<Integer, ResultSet> getFoundLuggageData(int year) {
        return this.getChartData(year, Main.LUGGAGE_FOUND);
    }
    
    /**
     * Get the handled luggage data based on year
     * @param year
     * @return 
     */
    public HashMap<Integer, ResultSet> getHandledLuggageData(int year) {
        return this.getChartData(year, Main.LUGGAGE_HANDLED);
    }
    
    /**
     * Get the insuranced luggage data based on year
     * @param year
     * @return 
     */
    public HashMap<Integer, ResultSet> getInsurancedLuggageData(int year) {
        return this.getChartData(year, Main.LUGGAGE_INSURANCE);
    }
>>>>>>> 453ec5a2e2e6fecf2f1ae237a3c80af816e53470
}
