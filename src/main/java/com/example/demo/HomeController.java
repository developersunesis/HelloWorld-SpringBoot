package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * This controller gets the route to the home page
 */
@Controller
public class HomeController {
    
	/*
	 * RequestMapping is used to accept both GET and POST methods
	 * The page(model) method then outputs the result
	 */
    @RequestMapping("/")
    public @ResponseBody String page() {
        return "HelloWorld from SpringBoot";
    }
}