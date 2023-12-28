/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javasrc;

/**
 *
 * @author mohammadali081101
 */
public class FictionBook implements Book {
    private int id,quantity;
    private String name,author,category;

    public FictionBook(int id, int quantity, String name, String author, String category) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.author = author;
        this.category = category;
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

    public String getCategory() {
        return category;
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

    public void setCategory(String category) {
        this.category = category;
    }
    
    
     @Override
    public void displayInfo(ManageBooks manageBook) {
        Class<?> manageBooksClass = manageBook.getClass();
        MessageDisplayer.showMessage(manageBooksClass, "New Fiction Book has been created!");
    }
}
