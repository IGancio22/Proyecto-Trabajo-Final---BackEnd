package com.miproyectoyoprogramo.portfoliowebsite.repo;

import com.miproyectoyoprogramo.portfoliowebsite.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SkillRepo extends JpaRepository<Skill, Long> {
    Optional<Skill> findSkillById(Long id);

    void deleteSkillById(Long id);
}
