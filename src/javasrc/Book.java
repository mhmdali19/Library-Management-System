/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javasrc;

/**
 *
 * @author serena
 */
public class Book {
    
    private int id,quantity;
    private String name,author;

    
    public Book(){
     
    }
    
    public Book(int id, int quantity, String name, String author) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    
    
    
    
    
}
