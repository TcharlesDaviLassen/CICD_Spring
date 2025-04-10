package cicd.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String hello(@RequestParam(defaultValue = "Mundo") String nome) {
        return "Olá CICD, " + nome + "!";
    }
}
