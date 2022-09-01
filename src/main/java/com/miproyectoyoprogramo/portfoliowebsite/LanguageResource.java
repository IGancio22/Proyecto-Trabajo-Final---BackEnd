package com.miproyectoyoprogramo.portfoliowebsite;

import com.miproyectoyoprogramo.portfoliowebsite.model.Language;
import com.miproyectoyoprogramo.portfoliowebsite.service.LanguageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/language")
public class LanguageResource {
    private final LanguageService languageService;

    public LanguageResource(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Language>> getAllLanguage () {
        List<Language> language = languageService.findAllLanguage();
        return new ResponseEntity<>(language, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Language> getLanguageById (@PathVariable("id") Long id)  {
        Language language = languageService.findLanguageById(id);
        return new ResponseEntity<>(language, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Language> addLanguage(@RequestBody Language language) {
        Language newLanguage = languageService.addLanguage(language);
        return new ResponseEntity<>(newLanguage, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Language> updateLanguage(@RequestBody Language language) {
        Language updateLanguage = languageService.updateLanguage(language);
        return new ResponseEntity<>(updateLanguage, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteLanguage(@PathVariable("id") Long id) {
        languageService.deleteLanguage(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
