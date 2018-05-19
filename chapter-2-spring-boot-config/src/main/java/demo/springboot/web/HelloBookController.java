package demo.springboot.web;

import demo.springboot.config.BookComponent;
import demo.springboot.config.BookProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot Hello案例
 *
 * Created by bysocket on 26/09/2017.
 */
@RestController
public class HelloBookController {

    @Autowired
    BookProperties bookProperties;

    @Autowired
    BookComponent bookComponent;
    @GetMapping("/book/hello")
    public String sayHello() {
        String bookPropertiesString = "Hello， " + bookProperties.getWriter() + " is writing "
                + bookProperties.getName() + " ！";


        String bookComponentString = "\n\r你好，"  + bookComponent.getName() + "\t" + bookComponent.getWriter();
        return bookPropertiesString + bookComponentString;
    }
}
