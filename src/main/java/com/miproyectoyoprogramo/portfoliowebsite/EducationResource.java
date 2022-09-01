package com.miproyectoyoprogramo.portfoliowebsite;

import com.miproyectoyoprogramo.portfoliowebsite.model.Education;
import com.miproyectoyoprogramo.portfoliowebsite.service.EducationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/education")
public class EducationResource {
    private final EducationService educationService;

    public EducationResource(EducationService educationService) {
        this.educationService = educationService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Education>> getAllEducation () {
        List<Education> education = educationService.findAllEducation();
        return new ResponseEntity<>(education, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Education> getEducationById (@PathVariable("id") Long id)  {
        Education education = educationService.findEducationById(id);
        return new ResponseEntity<>(education, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Education> addEducation(@RequestBody Education education) {
        Education newEducation = educationService.addEducation(education);
        return new ResponseEntity<>(newEducation, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Education> updateEducation(@RequestBody Education education) {
        Education updateEducation = educationService.updateEducation(education);
        return new ResponseEntity<>(updateEducation, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEducation(@PathVariable("id") Long id) {
        educationService.deleteEducation(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}