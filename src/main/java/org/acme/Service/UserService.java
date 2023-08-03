package org.acme.Service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;

import org.acme.Entity.User;
import org.acme.Repository.UserRepository;

@ApplicationScoped
@Transactional
public class UserService {
    
    @Inject
    UserRepository UserRepository;

    public void addUSer(User user){
        UserRepository.persist(user);
    }

    public List<User> findAll(){
        return  UserRepository.listAll();
    }
}
