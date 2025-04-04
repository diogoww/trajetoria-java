package br.com.diogow.gestao_vagas.modules.candidate.controllers;

import br.com.diogow.gestao_vagas.modules.candidate.CandidateEntity;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate")
public class CandidateController {


    @PostMapping("/")
    public void create(@Valid @RequestBody CandidateEntity candidateEntity){
        System.out.println("candidato");
        System.out.println(candidateEntity.getEmail());
    }
}
