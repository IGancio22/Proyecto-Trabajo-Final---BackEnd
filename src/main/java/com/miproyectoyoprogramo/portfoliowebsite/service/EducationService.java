package com.miproyectoyoprogramo.portfoliowebsite.service;

import com.miproyectoyoprogramo.portfoliowebsite.exception.NotFoundException;
import com.miproyectoyoprogramo.portfoliowebsite.model.Education;
import com.miproyectoyoprogramo.portfoliowebsite.repo.EducationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EducationService {

    private final EducationRepo educationRepo;

    @Autowired
    public EducationService(EducationRepo educationRepo) {
        this.educationRepo = educationRepo;
    }

    public Education addEducation(Education education) {
        return educationRepo.save(education);
    }

    public List<Education> findAllEducation(){
        return educationRepo.findAll();
    }

    public Education updateEducation(Education education) {
        return educationRepo.save(education);
    }

    public Education findEducationById(Long id){
        return educationRepo.findEducationById(id).orElseThrow(() -> new NotFoundException("Resource by id " + id + " was not found"));
    }

    public void deleteEducation(Long id){
        educationRepo.deleteEducationById(id);
    }
}
