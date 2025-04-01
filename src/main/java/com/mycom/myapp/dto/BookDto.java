package com.mycom.myapp.dto;

public class BookDto {
    private int bookid;
    private String bookname;
    private String publisher;
    private int price;

    // 기본 생성자
    public BookDto() {}

    // 모든 필드를 포함한 생성자
    public BookDto(int bookid, String bookname, String publisher, int price) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.publisher = publisher;
        this.price = price;
    }

    // Getter & Setter
    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // toString() 오버라이드 (디버깅용)
    @Override
    public String toString() {
        return "BookDto{" +
                "bookid=" + bookid +
                ", bookname='" + bookname + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                '}';
    }
}
