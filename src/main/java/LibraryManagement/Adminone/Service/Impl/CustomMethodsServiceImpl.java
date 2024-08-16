package LibraryManagement.Adminone.Service.Impl;

import LibraryManagement.Adminone.Model.Book;
import LibraryManagement.Adminone.Service.BookService;
import LibraryManagement.Adminone.Service.CustomFeatures;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomMethodsServiceImpl implements CustomFeatures {

    @Autowired
    BookService bookService;

    @Override
    public List<Book> getbyspectialcategory(List<String> requiredcategory) {
        List<Book> all= bookService.getallbooks();
        List<Book> filtered=all.stream().filter(n->n.getCategory().stream().anyMatch(m->requiredcategory.contains(m))).collect(Collectors.toList());
        return filtered;
    }
}
