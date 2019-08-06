package com.testService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/***
 *
 * @author Cristina Teste cd-ci.
 */

@SpringBootApplication
@ComponentScan(basePackageClasses = { TestController.class })
@EnableAutoConfiguration
public class TestServiceApplication {

    /**
     * Print something.
     * @return void method.
     */
    public static void main(final String[] args) {
        SpringApplication.run(TestServiceApplication.class, args);
        System.exit(0);
    }

}
