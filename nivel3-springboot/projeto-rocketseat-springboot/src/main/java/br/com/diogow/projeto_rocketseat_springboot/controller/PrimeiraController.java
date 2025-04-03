package br.com.diogow.projeto_rocketseat_springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiracontroller")
public class PrimeiraController {
    @GetMapping("/primeirometodo")
    public String primeirometodo() {
        return "a minha primeira rota";
    }
}
