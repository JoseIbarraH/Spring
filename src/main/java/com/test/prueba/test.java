package com.test.prueba;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class test {
    @GetMapping("/hola")
    public String saludar(){
        return "you never stop of learning";
    }
}
