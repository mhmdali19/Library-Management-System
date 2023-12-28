/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javasrc;

/**
 *
 * @author mohammadali081101
 */

   public class BookMemento {
    private final int bookId;
    private final String bookName;
    private final String author;
    private final int quantity;

    public BookMemento(int bookId, String bookName, String author, int quantity) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.quantity = quantity;
    }
    
}
