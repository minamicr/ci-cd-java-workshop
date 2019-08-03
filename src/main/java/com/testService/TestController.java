package com.testService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 *
 * @author Cristina
 * Teste cd-ci.
 * @return teste
 */

@RestController
@CrossOrigin
public class TestController {

    @GetMapping("/home")
    public String homeRequest() {
        return "Hello World!";
    }
}
