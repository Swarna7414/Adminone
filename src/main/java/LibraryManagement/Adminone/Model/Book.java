package LibraryManagement.Adminone.Model;

import jakarta.persistence.*;


import java.util.List;

@Entity
@Table(name = "Book")
public class Book {

    @Id
    private Integer id;

    private String name;

    private String Author;

    @ElementCollection
    @CollectionTable(name = "Book_category",joinColumns = @JoinColumn(name = "book_id"))
    private List<String> category;

    public Book() {
    }
    public Book(Integer id, String name, String author, List<String> category) {
        this.id = id;
        this.name = name;
        Author = author;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }
}
