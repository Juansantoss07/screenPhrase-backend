package br.com.screenphrase.screenprhase.service;

import br.com.screenphrase.screenprhase.FilmeRepository;
import br.com.screenphrase.screenprhase.dto.FilmeDTO;
import br.com.screenphrase.screenprhase.models.Filme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository repository;

    public FilmeDTO obterDadosFilme(){
        Filme dado = repository.encontrarFilmeAleatorio();
        return new FilmeDTO(dado.getTitulo(), dado.getFrase(), dado.getPersonagem(), dado.getPoster());
    }
}
