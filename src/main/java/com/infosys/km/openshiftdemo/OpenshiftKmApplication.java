package com.infosys.km.openshiftdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class OpenshiftKmApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftKmApplication.class, args);
	}
	

}


@RestController
class GreetingController {

    @RequestMapping("/hello/{name}")
    String hello(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
}
