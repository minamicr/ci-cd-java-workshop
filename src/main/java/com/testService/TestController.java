package com.testService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 *
 * @author Cristina Teste cd-ci.
 * @return teste.
 */

@RestController
@CrossOrigin
public class TestController {

    /**
     * Example of get.
     * @return any string.
     */
    @GetMapping("/home")
    public String homeRequest() {
        return "Hello World!";
    }

    /**
     * Example of get.
     * @return any string.
     */
    @GetMapping("/teste")
    public String testeRequest() {
        return "Teste Request";
    }
}
