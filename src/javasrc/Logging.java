/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javasrc;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author serena
 */
public class Logging {
    
      private static Logging instance = null;

    // Private constructor to prevent instantiation
    private Logging() {
        // initialization code here
    }

    // Method to get the instance of the logger
    public static Logging getInstance() {
        if (instance == null) {
            instance = new Logging();
        }
        return instance;
    }

    // Method to log messages
    public void log(String message) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("log.txt", true))) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String formattedDate = dateFormat.format(new Date());
            writer.println(formattedDate + ": " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
