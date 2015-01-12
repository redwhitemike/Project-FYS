/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.swing.*;

/**
 *
 * @author Youssri
 */
public class Validator {
    public static boolean isEmpty(Object object) {
        if (object instanceof JTextField) {
            JTextField textField = (JTextField) object;
            
            return textField.getText().isEmpty();
        }
        
        return true;
    }
    
    public static boolean betweenLength(Object object, int minLength, int maxLength) {
        if (object instanceof JTextField) {
            JTextField textField = (JTextField) object;
            int length = textField.getText().length();
            
            return length > minLength && length < maxLength;
        }
        
        return false;
    }
    
    public static boolean numbersOnly(Object object) {
        if (object instanceof JTextField) {
            JTextField textField = (JTextField) object;
            
            for (char c : textField.getText().toCharArray()) {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
}
