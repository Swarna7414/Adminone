package LibraryManagement.Adminone.Controller;

import LibraryManagement.Adminone.Model.Book;
import LibraryManagement.Adminone.Service.BookService;
import LibraryManagement.Adminone.Service.CustomFeatures;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @Autowired
    private CustomFeatures customFeatures;

    @PostMapping("/create")
    public String createbook(@RequestBody Book book){
        return bookService.savebook(book);
    }

    @GetMapping("/onebook/{id}")
    public Book getbood(@PathVariable Integer id){
        Optional<Book> book=bookService.getbook(id);
        return book.orElseThrow(()->new NoSuchElementException("Book was not found"));
    }

    @GetMapping("/all")
    public List<Book> getallbooks(){
        return bookService.getallbooks();
    }
}
