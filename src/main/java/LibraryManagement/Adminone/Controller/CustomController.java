package LibraryManagement.Adminone.Controller;

import LibraryManagement.Adminone.Model.Book;
import LibraryManagement.Adminone.Service.CustomFeatures;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/custom")
public class CustomController {

    @Autowired
    CustomFeatures customFeatures;

    @GetMapping("/pirticular")
    public List<Book> getpirticular(@RequestParam List<String> category){
        return customFeatures.getbyspectialcategory(category);
    }

}
