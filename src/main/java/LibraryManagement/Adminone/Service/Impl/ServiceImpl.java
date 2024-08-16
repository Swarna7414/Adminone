package LibraryManagement.Adminone.Service.Impl;

import LibraryManagement.Adminone.Model.Book;
import LibraryManagement.Adminone.Repository.BooksRepository;
import LibraryManagement.Adminone.Service.BookService;
import LibraryManagement.Adminone.Service.CustomFeatures;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ServiceImpl implements BookService {

    @Autowired
    private BooksRepository repository;

    @Override
    public String savebook(Book book) {
        repository.save(book);
        return "Book Saved Successfully";
    }

    @Override
    public Optional<Book> getbook(Integer id) {
        return repository.findById(id);
    }

    @Override
    public List<Book> getallbooks() {
        return repository.findAll();
    }
}
