package com.alura.challenge_literalura.persistence.repository;

import com.alura.challenge_literalura.persistence.entity.Autor;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AutorRepository extends JpaRepository<Autor, Long> {

    Optional<Autor> findByNameContainsIgnoreCase(String name);

    List<Autor> findAutorsByBirthDate(Integer birthdate);

    List<Autor> findAutorsByDeathDate(Integer deathDate);
}
