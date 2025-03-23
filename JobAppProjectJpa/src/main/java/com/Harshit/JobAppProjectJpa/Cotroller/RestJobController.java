package com.Harshit.JobAppProjectJpa.Cotroller;

import com.Harshit.JobAppProjectJpa.model.JobPost;
import com.Harshit.JobAppProjectJpa.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class RestJobController {
    @Autowired
    Service service;
    @GetMapping("jobPosts")
    public List<JobPost> getalljob(){
        return service.getalljob();
    }
    @GetMapping("jobPost/{postid}")
    public JobPost getjob(@PathVariable int postid){
        return service.getjob(postid);
    }

    @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost) {
        service.addJob(jobPost);
        return service.getjob(jobPost.getPostId());
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost) {
        service.updateJob(jobPost);
        return service.getjob(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable int postId)
    {
        service.deleteJob(postId);
        return "Deleted";
    }

}
