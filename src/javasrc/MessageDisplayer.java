/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javasrc;

import javax.swing.*;

/**
 *
 * @author mohammadali081101
 */
public class MessageDisplayer {
    public static void showMessage(Class<?> displayClass, String message) {
        try {
            // Check if the class is a subclass of JFrame or JDialog
            if (JFrame.class.isAssignableFrom(displayClass) || JDialog.class.isAssignableFrom(displayClass)) {
                JOptionPane.showMessageDialog((java.awt.Component) displayClass.newInstance(), message);
            } else {
                // If not a subclass of JFrame or JDialog, show message in console
                System.out.println(message);
            }
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}