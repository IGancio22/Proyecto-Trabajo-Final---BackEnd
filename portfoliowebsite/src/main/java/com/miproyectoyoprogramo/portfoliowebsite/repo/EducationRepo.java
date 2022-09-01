package com.miproyectoyoprogramo.portfoliowebsite.repo;

import com.miproyectoyoprogramo.portfoliowebsite.model.Education;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EducationRepo extends JpaRepository<Education, Long> {

    Optional<Education> findEducationById(Long id);

    void deleteEducationById(Long id);
}
