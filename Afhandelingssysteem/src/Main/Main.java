/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    public static final int FRAME_WIDTH = 1024;
    public static final int FRAME_HEIGHT = 740;
    public static final String NAME = "bagagge systeem";
    private JFrame mainWindow;
    private static final login login = new login();
    private static Main instance = new Main();
    
    public void startup() {
        mainWindow = new JFrame(NAME);
        mainWindow.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        mainWindow.setBackground(Color.white);
        /** Make the window closing [x] button on the frame active */
        mainWindow.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent event) {
                shutdown();
            }
        });

        mainWindow.getContentPane().setLayout(new BorderLayout());
        showPanel(new login());

        mainWindow.setVisible(true);
    }

    public void showPanel(JPanel panel) {
        mainWindow.getContentPane().removeAll();
        mainWindow.getContentPane().add(panel, BorderLayout.CENTER);
        mainWindow.getContentPane().validate();
        mainWindow.getContentPane().repaint();
    }
    private void shutdown() {
        mainWindow.dispose();
    }
    
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

}

