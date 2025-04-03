package br.com.diogow.projeto_rocketseat_springboot.ioc_di;

import org.springframework.stereotype.Service;

@Service
public class MeuComponent {
    public String chamarMeuComponent(){
        return "chamando meu component";
    }
}
