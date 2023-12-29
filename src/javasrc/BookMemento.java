/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javasrc;

/**
 *

 * @author mohammadali081101
 */

   

 
// Memento class
public class BookMemento {

    private int bookId ;
    private String bookName;
    private  String author;
    private int quantity;
    private String operation;

    public BookMemento(int bookId, String bookName, String author, int quantity) {}

     

    public BookMemento(int bookId, String bookName, String author, int quantity, String operation) {

        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.quantity = quantity;
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }
    
    
}


