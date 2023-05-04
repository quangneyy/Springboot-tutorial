package com.tutorial.apidemo.Springboot.tutorial.models;

public class Book {
//    private Long id;
//    private String productName;
//    private int year;
//    private Double price;
//    private String url;
    private int id;
    private String title;
    private String author;
    private Long price;
    //default constructor
    public Book() {

    }

//    public Book(Long id, String productName, int year, Double price, String url) {
//        this.id = id;
//        this.productName = productName;
//        this.year = year;
//        this.price = price;
//        this.url = url;
//    }
    public Book(int id, String title, String author, Long price) {
//        this.id = id;
//        this.productName = productName;
//        this.year = year;
//        this.price = price;
//        this.url = url;
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

//    @Override
//    public String toString() {
//        return "Product{" +
//                "id=" + id +
//                ", productName='" + productName + '\'' +
//                ", year=" + year +
//                ", price=" + price +
//                ", url='" + url + '\'' +
//                '}';
//    }
}
