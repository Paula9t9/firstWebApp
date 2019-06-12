package com.fedyr.code401.firstWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstAppController {

    @GetMapping("/hello")
    public String getHelloWorld() {
        return "Hello, world.";
    }

    @GetMapping("capitalize/{input}")
    public String capitalize(@PathVariable String input){

        input = input.toUpperCase();
        return input;
    }

    // Used a solution from Geeks for Geeks https://www.geeksforgeeks.org/reverse-a-string-in-java/
    @RequestMapping("/reverse")
    public String reverse(@RequestParam String sentence){

        StringBuilder stringBuilder = new StringBuilder();

        // append a string into StringBuilder input1
        stringBuilder.append(sentence);

        // reverse StringBuilder input1
        stringBuilder = stringBuilder.reverse();

       return stringBuilder.toString();
    }

}
