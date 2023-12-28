/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javasrc;

/**
 *
 * @author mohammadali081101
 */
public class Student implements Observer {
    private int id;
 private String name;
 private String course;
 private String branch;
 private String email;
 
 
 public Student(String name,String email){
 this.name = name;
 this.email = email;
 
 }
 
 @Override
    public void update(String email, String message) {
        // Implement sending email here using email and message
        SendEmail(email, message);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
 
 public void SendEmail(String email,String msg){
 
    System.out.println("Helloooo");
        String outlookUsername = "Javacourse99@outlook.com";
        String outlookPassword = "advancedJava99";

        EmailSender outlookEmailSender = new EmailSender(outlookUsername, outlookPassword);

        String recipientGmail = email;
        String subject = "Java Library Notification";
        String message = msg;

        outlookEmailSender.sendEmail(recipientGmail, subject, message);
        System.out.println("Email sent successfully!");
 
 }
 
}
