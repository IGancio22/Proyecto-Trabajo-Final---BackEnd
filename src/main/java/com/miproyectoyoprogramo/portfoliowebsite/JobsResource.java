package com.miproyectoyoprogramo.portfoliowebsite;

import com.miproyectoyoprogramo.portfoliowebsite.model.Jobs;
import com.miproyectoyoprogramo.portfoliowebsite.service.JobsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobsResource {
    private final JobsService jobsService;

    public JobsResource(JobsService jobsService) {
        this.jobsService = jobsService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Jobs>> getAllJobs () {
        List<Jobs> jobs = jobsService.findAllJobs();
        return new ResponseEntity<>(jobs, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Jobs> getJobsById (@PathVariable("id") Long id)  {
        Jobs jobs = jobsService.findJobsById(id);
        return new ResponseEntity<>(jobs, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Jobs> addJobs(@RequestBody Jobs jobs) {
        Jobs newJobs = jobsService.addJobs(jobs);
        return new ResponseEntity<>(newJobs, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Jobs> updateJobs(@RequestBody Jobs jobs) {
        Jobs updateJobs = jobsService.updateJobs(jobs);
        return new ResponseEntity<>(updateJobs, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteJobs(@PathVariable("id") Long id) {
        jobsService.deleteJobs(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
