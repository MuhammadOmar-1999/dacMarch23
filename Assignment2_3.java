package Assignments.Assignment2_solutions;

class Book{
    private String title;
    private String author;
    private String publisher;
    private String ISBN;
    private int year;
    private double price; 
    private int quantity;

    Book(String title, String author, String publisher, String ISBN, int year, double price, int quantity ){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.ISBN = ISBN;
        this.year = year;
        this.price = price; 
        this.quantity = quantity;
    }
    //Setters and getters
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getPublisher(){
        return this.publisher;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public String getISBN(){
        return this.ISBN;
    }
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    //Business logic methods
    public void increaseQuantity(int quantity){
        this.quantity = this.quantity + quantity;
    }
    public void decreaseQuantity(int quantity){
        this.quantity = this.quantity - quantity;
    }
    public double getInventoryValue(){
        double value = this.quantity * this.price;
        return value;
    }
}
public class Assignment2_3 {
    public static void main(String[] args){
        Book b1 = new Book("You are the placebo","Dr. Jor Dispenza","HAY house","978-93-94613-31-6",2022,600.0,100);
        System.out.println("Book details: \n");
        System.out.println("Title: "+b1.getTitle());
        System.out.println("Author: "+b1.getAuthor());
        System.out.println("Publibsher: "+b1.getPublisher());
        System.out.println("ISBN: "+b1.getISBN());
        System.out.println("Year of publishing: "+b1.getYear());
        System.out.println("Price: "+b1.getPrice());
        System.out.println("Quantity available: "+b1.getQuantity()+"\n");


        b1.increaseQuantity(10);
        System.out.println("Quantity available after increasing: "+b1.getQuantity());
        b1.decreaseQuantity(5);
        System.out.println("Quantity available after decreasing: "+b1.getQuantity());
        double inventoryValue = b1.getInventoryValue();
        System.out.println("Total inventory value: "+inventoryValue);

    }
}
