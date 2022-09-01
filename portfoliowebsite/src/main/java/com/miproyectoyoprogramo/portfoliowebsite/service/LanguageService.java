package com.miproyectoyoprogramo.portfoliowebsite.service;

import com.miproyectoyoprogramo.portfoliowebsite.exception.NotFoundException;
import com.miproyectoyoprogramo.portfoliowebsite.model.Language;
import com.miproyectoyoprogramo.portfoliowebsite.repo.LanguageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class LanguageService {

    private final LanguageRepo languageRepo;

    @Autowired
    public LanguageService(LanguageRepo languageRepo) {
        this.languageRepo = languageRepo;
    }

    public Language addLanguage(Language language) {
        return languageRepo.save(language);
    }

    public List<Language> findAllLanguage(){
        return languageRepo.findAll();
    }

    public Language updateLanguage(Language language) {
        return languageRepo.save(language);
    }

    public Language findLanguageById(Long id){
        return languageRepo.findLanguageById(id).orElseThrow(() -> new NotFoundException("Resource by id " + id + " was not found"));
    }

    public void deleteLanguage(Long id){
        languageRepo.deleteLanguageById(id);
    }

}
