package Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

        
/**
 *
 * @author Mika
 */


public class Main {
    // Frame Variables
    public static final int FRAME_WIDTH = 1044;
    public static final int FRAME_HEIGHT = 740;
    public static final String NAME = "Corendon - Luggage System";
    private static final Main instance = new Main();
    private JFrame mainWindow;
   
    // Function Constants
    public static final int FUNCTION_CUSTOMER = 0;
    public static final int FUNCTION_EMPLOYEE = 1;
    public static final int FUNCTION_MANAGER = 2;
    public static final int FUNCTION_APP_MANAGER = 3;
    
    // Status Constants
    public static final int LUGGAGE_MISSING = 0;
    
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

    public static void exceptionPrint(Exception exception) {
        System.err.println("-- Exception catched --");
        System.err.println("Name: " + exception.getClass().getName());
        System.err.println("Message: " + exception.getMessage());
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

