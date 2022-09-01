package com.miproyectoyoprogramo.portfoliowebsite.repo;

import com.miproyectoyoprogramo.portfoliowebsite.model.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JobsRepo extends JpaRepository<Jobs, Long> {
    void deleteJobsById(Long id);

    Optional<Jobs> findJobsById(Long id);
}
