package com.pojo;

/**
 * @Author: Diao Rui
 * @className: Book
 * @Description: TODO
 * @DateTime: 2023/8/8 16:41
 * @version: 1.0
 **/
public class Book {
    private Integer book_id;
    private String book_name;
    private Integer price;
    private Integer stock;

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_id=" + book_id +
                ", book_name='" + book_name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
