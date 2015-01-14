package Main;

import java.util.HashMap;

/**
 *
 * @author IS104_2
 */
public class Session {
    public HashMap<String, Object> values = new HashMap<>();
    public static Session instance = new Session();
    
    public static Session getInstance() {
        return instance;
    }
    
    /**
     * Sets a value for the specified key
     * @param key
     * @param value 
     */
    public void setValue(String key, Object value) {
        values.put(key, value);
    }
    
    /**
     * Returns a String of the value.
     * @param key
     * @return 
     */
    public String getValue(String key) {
        try {
            return values.get(key).toString();
        } catch (NullPointerException e) {
            Main.exceptionPrint(e);
            return null;
        }
    }
    
    /**
     * Removes a key from the hashmap
     * @param key 
     */
    public void removeKey(String key) {
        values.remove(key);
    }
    
    /**
     * Logs the user out, removing the session values and showing the login screen.
     */
    public void logoutUser() {
        values.clear();
        Main.getInstance().showPanel(new view.desk.LoginPanel());
    }
}
