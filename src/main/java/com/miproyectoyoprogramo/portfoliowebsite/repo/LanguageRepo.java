package com.miproyectoyoprogramo.portfoliowebsite.repo;

import com.miproyectoyoprogramo.portfoliowebsite.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LanguageRepo extends JpaRepository<Language, Long> {
    Optional<Language> findLanguageById(Long id);

    void deleteLanguageById(Long id);
}
