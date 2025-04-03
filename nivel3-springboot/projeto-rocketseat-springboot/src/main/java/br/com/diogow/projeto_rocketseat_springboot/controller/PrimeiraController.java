package br.com.diogow.projeto_rocketseat_springboot.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {
    @GetMapping("/primeiroMetodo/{id}")
    public String primeiroMetodo(@PathVariable String id) {
        return "o parametro eh " + id;
    }

    @GetMapping("/metodoComQueryParams")
    public String metodoComQueryParams(@RequestParam String id){
        return "o parametro com metodoComQueryParams eh " + id;
    }

    @GetMapping("/metodoComQueryParams2")
    public String metodoComQueryParams2(@RequestParam Map<String, String> allParms){
        return "o parametro com metodoComQueryParams2 eh " + allParms.entrySet();
    }

    @PostMapping("metodoComBodyParams")
    public String metodoComBodyParams(@RequestBody Usuario usuario){
        return  "metodoComBodyParams " + usuario.username();
    }

    record Usuario(String username){}
}
