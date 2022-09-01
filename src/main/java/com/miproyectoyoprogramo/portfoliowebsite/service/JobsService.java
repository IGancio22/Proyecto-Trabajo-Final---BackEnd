package com.miproyectoyoprogramo.portfoliowebsite.service;

import com.miproyectoyoprogramo.portfoliowebsite.exception.NotFoundException;
import com.miproyectoyoprogramo.portfoliowebsite.model.Jobs;
import com.miproyectoyoprogramo.portfoliowebsite.repo.JobsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class JobsService {
    private final JobsRepo jobsRepo;

    @Autowired
    public JobsService(JobsRepo jobsRepo) {
        this.jobsRepo = jobsRepo;
    }

    public Jobs addJobs(Jobs jobs) {
        return jobsRepo.save(jobs);
    }

    public List<Jobs> findAllJobs(){
        return jobsRepo.findAll();
    }

    public Jobs updateJobs(Jobs jobs) {
        return jobsRepo.save(jobs);
    }

    public Jobs findJobsById(Long id){
        return jobsRepo.findJobsById(id).orElseThrow(() -> new NotFoundException("Resource by id " + id + " was not found"));
    }

    public void deleteJobs(Long id){
        jobsRepo.deleteJobsById(id);
    }
}
