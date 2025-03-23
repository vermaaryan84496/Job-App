package com.Harshit.JobAppProjectJpa.repo;

import com.Harshit.JobAppProjectJpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,String> {
    User findByusername(String username);
}

