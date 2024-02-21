package com.lcwd.user.service.UserService.services;
import com.lcwd.user.service.UserService.entitiy.User;
import com.lcwd.user.service.UserService.exceptions.ResourceNotFoundException;
import com.lcwd.user.service.UserService.repositores.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;
@Service
public class Impl implements UserService{

    @Autowired
    private UserRepository userRepository;
    
    @Override
    public User saveUser(User  user)
    {
        //generate unique user id
      String randomUserId = UUID.randomUUID().toString();
      user.setUserId(randomUserId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById( userId ).orElseThrow(()-> new ResourceNotFoundException("User with given id is not found on server !! :"+userId));
    }
}
