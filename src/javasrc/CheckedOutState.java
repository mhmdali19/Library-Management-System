/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javasrc;

/**
 *
 * @author serena
 */
public class CheckedOutState implements BookState {
    @Override
    public void handleBookStatus(IssueBook issueBook) {
        System.out.println("Book is CHECKED OUT.");
        issueBook.setBookStatus(BookStatus.CHECKEDOUT);
    }
    
}
