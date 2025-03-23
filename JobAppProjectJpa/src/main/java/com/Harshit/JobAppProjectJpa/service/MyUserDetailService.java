package com.Harshit.JobAppProjectJpa.service;

import com.Harshit.JobAppProjectJpa.model.User;
import com.Harshit.JobAppProjectJpa.model.UserPricipal;
import com.Harshit.JobAppProjectJpa.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired
     private UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=userRepo.findByusername(username);
       if(user==null)
           throw new UsernameNotFoundException("User404");
       else
           return  new UserPricipal(user);
    }
}
