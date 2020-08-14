package com.jpop.user.service;

import com.jpop.user.entity.User;
import com.jpop.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers()
    {
      return userRepository.findAll();
    }

    @Transactional
    public User saveUser(User user)
    {
        return userRepository.save(user);
    }

    public User getUserByID(Integer id) {
       return userRepository.findById(id).get();
    }

    public User deleteUserByID(Integer id) {
        User user=userRepository.findById(id).get();
        userRepository.deleteById(id);
        return user;
    }

    @Transactional
    public User updateUser(User updatedUser) {
        User currentUser=userRepository.findById(updatedUser.getId()).get();
        currentUser.setFirstName(updatedUser.getFirstName());
        currentUser.setLastName(updatedUser.getLastName());
       return userRepository.save(currentUser);
    }
}
