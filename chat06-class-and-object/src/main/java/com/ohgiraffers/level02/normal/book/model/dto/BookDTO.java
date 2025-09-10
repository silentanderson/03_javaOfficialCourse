package com.ohgiraffers.level02.normal.book.model.dto;

public class BookDTO {
    // 필드 정의
    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    // constructor 정의
    // 기본 생성자
    public BookDTO() {}
    // 매개변수가 있는 생성자
    public BookDTO(String title, String publisher, String author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }
    public BookDTO(String title, String publisher, String author, int price, double discountRate) {
        this(title, publisher, author);
        this.price = price;
        this.discountRate = discountRate;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public double discountRate() {
        return discountRate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public void printInformation() {
        System.out.println(title + ", " + publisher + ", " + author + ", " + price + ", " + discountRate);
    }
}
