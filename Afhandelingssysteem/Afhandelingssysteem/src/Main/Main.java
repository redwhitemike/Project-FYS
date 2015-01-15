package Main;

import model.Employee;

import java.util.HashMap;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

        
/**
 *
 * @author IS104_2
 */


public class Main {
    // Static Variables
    public static Employee Employee;
    
    // Frame Variables
    public static final int FRAME_WIDTH = 1044;
    public static final int FRAME_HEIGHT = 740;
    public static final String NAME = "Corendon - Luggage System";
    
    private static final Main instance = new Main();

    public static JFrame mainWindow;
   
    // Function Constants
    public static final int FUNCTION_CUSTOMER = 0;
    public static final int FUNCTION_EMPLOYEE = 1;
    public static final int FUNCTION_MANAGER = 2;
    public static final int FUNCTION_APP_MANAGER = 3;
    
    // Status Constants
    public static final int LUGGAGE_MISSING = 0;
    public static final int LUGGAGE_FOUND = 1;
    public static final int LUGGAGE_HANDLED = 2;
    public static final int LUGGAGE_INSURANCE = 3;
    
    // Luggage types
    public static final int TYPE_BAG = 0;
    public static final int TYPE_CASE = 1;
    public static final int TYPE_HAND_LUGGAGE = 2;
    public static final int TYPE_OTHER = 3;
    
    /**
     * this constructor returns an instance
     * @return instance
     */
    public static Main getInstance() {    
        return instance;
    }
    
    public static void main(String args[]) {
        final Main applicatie = Main.getInstance();
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                try {
                    applicatie.startup();
                } catch (Exception e) {
                    System.out.println("Application" + applicatie.getClass().getName() + "failed to launch");
                }
            }
        });
    }

    /**
     * this method catches exceptions that have accured and prints
     * @param exception 
     */
    public static void exceptionPrint(Exception exception) {
        System.err.println("-- Exception catched --");
        System.err.println("Name: " + exception.getClass().getName());
        System.err.println("Message: " + exception.getMessage());
    }
    
    /**
     * this methode gets the username that someone has used to login with 
     * and displays it
     * @return null 
     */
    public static String getLoggedLabel() {
        try {
            return "Logged in as " + Main.Employee.getUsername();
        } catch (SQLException e) {
            Main.exceptionPrint(e);
        }
        
        return null;
    }
    /**
     * this methode opens a new Jframe where the manual is printed
     * @param panel 
     */
    public static void showHelpMenu(JPanel panel) {
       JFrame x = new JFrame();
       x.setSize(FRAME_WIDTH, FRAME_HEIGHT);
       x.getContentPane().removeAll();
       x.getContentPane().add(panel, BorderLayout.CENTER);
       x.getContentPane().validate();
       x.getContentPane().repaint();
       x.setVisible(true);
    }
    
    /**
     * this methode makes it possible to push the F1 key to open the manual
     * @param button 
     */
    public static void pressHelpKey(final JButton button){
       button.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                int key = ke.getKeyCode();
                if (key == KeyEvent.VK_F1) {
                    button.doClick(0);
                }
            }

            @Override
            public void keyReleased(KeyEvent ke) {
            }

        });

    }
    
    /**
     * this method makes sure that text that is written is only in numbers
     * @param text
     * @return true or false
     */
    public boolean onlyNumbers(String text) {
        for (char c : text.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        
        return true;
    }
    
    /**
     * this method makes sure that only letters are used in a piece of text
     * @param text
     * @return true or false
     */
    public boolean hasText(String text) {
        for (char c : text.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                return true;
            }
        }
        
        return false;
    }
    
    /**
     * Starting up the application.
     * Initiating main window and adding window listeners.
     */
    public void startup() {
        mainWindow = new JFrame(NAME);
        mainWindow.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        mainWindow.setBackground(Color.white);
        mainWindow.setResizable(false);
        
        /** Make the window closing [x] button on the frame active */
        mainWindow.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent event) {
                shutdown();
            }
        });

        mainWindow.getContentPane().setLayout(new BorderLayout());
        showPanel(new view.desk.LoginPanel());

        mainWindow.setVisible(true);
    }
    
    /**
     * Method to show a new panel.
     * @param panel 
     */
    public void showPanel(JPanel panel) {
        mainWindow.getContentPane().removeAll();
        mainWindow.getContentPane().add(panel, BorderLayout.CENTER);
        mainWindow.getContentPane().validate();
        mainWindow.getContentPane().repaint();
    }
    
    /**
     * Shuts down the application.
     */
    private void shutdown() {
        mainWindow.dispose();
    }

}

