package com.Harshit.JobAppProjectJpa.repo;

import com.Harshit.JobAppProjectJpa.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<JobPost,Integer> {
}
