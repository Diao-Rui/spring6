package org.example.di;

/**
 * @Author: Diao Rui
 * @className: Book
 * @Description: TODO
 * @DateTime: 2023/8/2 10:34
 * @version: 1.0
 **/
public class Book {
    private String Name;
    private String Author;

    public Book(String name, String author) {
        Name = name;
        Author = author;
    }

    public Book() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Name='" + Name + '\'' +
                ", Author='" + Author + '\'' +
                '}';
    }
}
