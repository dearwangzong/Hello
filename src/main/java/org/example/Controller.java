package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller
 *
 * @author SmithWang
 * 2023/7/10 16:22
 */
@RestController
@RequestMapping("/Hello")
public class Controller {


    @GetMapping("/HelloWord")
    public  String helloWord(){
        return  "HelloWord";
    }
}
