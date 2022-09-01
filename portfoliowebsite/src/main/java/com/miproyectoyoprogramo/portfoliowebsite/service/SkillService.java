package com.miproyectoyoprogramo.portfoliowebsite.service;

import com.miproyectoyoprogramo.portfoliowebsite.exception.NotFoundException;
import com.miproyectoyoprogramo.portfoliowebsite.model.Skill;
import com.miproyectoyoprogramo.portfoliowebsite.repo.SkillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SkillService {
    
    private final SkillRepo skillRepo;

    @Autowired
    public SkillService(SkillRepo skillRepo) {
        this.skillRepo = skillRepo;
    }

    public Skill addSkill(Skill skill) {
        return skillRepo.save(skill);
    }

    public List<Skill> findAllSkill(){
        return skillRepo.findAll();
    }

    public Skill updateSkill(Skill skill) {
        return skillRepo.save(skill);
    }

    public Skill findSkillById(Long id){
        return skillRepo.findSkillById(id).orElseThrow(() -> new NotFoundException("Resource by id " + id + " was not found"));
    }

    public void deleteSkill(Long id){
        skillRepo.deleteSkillById(id);
    }
    
}
