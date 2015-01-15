/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.swing.*;

/**
 * this class validates certain objects if they meet the criteria 
 * @author IS104_2
 */
public class Validator {
    /**
     * this method look if the object is empty
     * @param object
     * @return 
     */
    public static boolean isEmpty(Object object) {
        if (object instanceof JTextField) {
            JTextField textField = (JTextField) object;
            
            return textField.getText().isEmpty();
        }
        
        return true;
    }
    
    /**
     * this method look if the object is a certain length and if it meets the
     * criteria
     * @param object
     * @param minLength
     * @param maxLength
     * @return 
     */
    public static boolean betweenLength(Object object, int minLength, int maxLength) {
        if (object instanceof JTextField) {
            JTextField textField = (JTextField) object;
            int length = textField.getText().length();
            
            return length > minLength && length < maxLength;
        }
        
        return false;
    }
    
    /**
     * this method looks if the method only exists out of numbers
     * @param object
     * @return 
     */
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
