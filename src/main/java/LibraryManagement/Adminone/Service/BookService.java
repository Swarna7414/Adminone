package LibraryManagement.Adminone.Service;

import LibraryManagement.Adminone.Model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    public String savebook(Book book);

    public Optional<Book> getbook(Integer id);

    public List<Book> getallbooks();
}
