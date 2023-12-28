/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javasrc;

/**
 *
 * @author mohammadali081101
 */
public class NonFictionBookFactory implements BookFactory {
    
    private int id,quantity;
    private String name,author,category;

    public NonFictionBookFactory(int id, int quantity, String name, String author, String category) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.author = author;
        this.category = category;
    }
    
    @Override
    public Book createBook() {
    return new NonFictionBook(id,quantity,name,author,category);
    }
}
