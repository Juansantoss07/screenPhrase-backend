package br.com.screenphrase.screenprhase;

import br.com.screenphrase.screenprhase.models.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FilmeRepository extends JpaRepository<Filme, Long> {

    @Query(value = "SELECT * FROM filmes ORDER BY RANDOM() LIMIT 1;", nativeQuery = true)
    Filme encontrarFilmeAleatorio();
}
