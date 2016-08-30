package com.company.Lessons_home_Work.Lesson8_less_Work;

public class Book {
    private String id;
    private String title;
    private Author author;
    private String year;
    private String description;
    private String isbn;

    public Book(String id, String title, Author author, String year, String description, String isbn) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.description = description;
        this.isbn = isbn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", year='" + year + '\'' +
                ", description='" + description + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;
        if (title != null ? !title.equals(book.getTitle()) : book.getTitle() != null ) return false;
        if (isbn != null ? !isbn.equals(book.getTitle()) : book.getTitle() != null ) return false;
        if (author != null ? !author.equals(book.getTitle()) : book.getTitle() != null ) return false;
        return year != null ? year.equals(book.getYear()) : book.getYear() == null;
    }

}
