package com.Harshit.JobAppProjectJpa.service;

import com.Harshit.JobAppProjectJpa.model.JobPost;
import com.Harshit.JobAppProjectJpa.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
     Repo repo;
    public List<JobPost> getalljob() {
        return repo.findAll();
    }
    public void addjob(JobPost jobPost){
        repo.save(jobPost);
    }

    public JobPost getjob(int postid) {
        return (JobPost) repo.findById(postid).orElse(new JobPost(0,"none","not found",2,List.of("not found","not fond")));
    }

    public void addJob(JobPost jobPost) {
        repo.save(jobPost);
    }

    public void updateJob(JobPost jobPost) {
        repo.save(jobPost);
    }

    public void deleteJob(int postId) {
        repo.deleteById(postId);
    }
}
