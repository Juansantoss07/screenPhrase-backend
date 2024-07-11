package br.com.screenphrase.screenprhase.controllers;

import br.com.screenphrase.screenprhase.dto.FilmeDTO;
import br.com.screenphrase.screenprhase.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
public class FilmeController {

    @Autowired
    private FilmeService service;

    @GetMapping("/frases")
    public FilmeDTO obterDadosFilme(){
        return service.obterDadosFilme();
    }
}
