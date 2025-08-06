package com.scm.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.scm.entities.User;
import com.scm.helper.AppConstants;
import com.scm.helper.ResourceNotFoundException;
import com.scm.repository.UserRepository;
import com.scm.services.UserService;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private PasswordEncoder passwordEncoder;
  
  @Autowired
  private UserRepository repo;

  private Logger logger = LoggerFactory.getLogger(this.getClass());

  @Override
  public User saveUser(User user) {
    String userId = UUID.randomUUID().toString();
    //set the userid
    user.setUserId(userId);
    //encode the password
    user.setPassword(passwordEncoder.encode(user.getPassword()));
    //set the UserRole
    user.setRoleList(List.of(AppConstants.ROLE_USER));

    logger.info(user.getProvider().toString());

    //set the profile pic
    return repo.save(user);
    
  }

  @Override
  public Optional<User> getUserById(String id) {
    
    return repo.findById(id);
  }

  @Override
  public Optional<User> UpdateUser(User user) {

    User user2 = repo.findById(user.getUserId()).orElseThrow(() -> new ResourceNotFoundException("User Not found"));
    user2.setName(user.getName());
    user2.setEmail(user.getEmail());
    user2.setPassword(user.getPassword());
    user2.setAbout(user.getAbout());
    user2.setPhoneNumber(user.getPhoneNumber());
    user2.setProfilePic(user.getProfilePic());
    user2.setEnabled(user.isEnabled());
    user2.setEmailVerified(user.isEmailVerified());
    user2.setPhoneVerified(user.isPhoneVerified());
    user2.setProvider(user.getProvider());
    user2.setProviderUserId(user.getProviderUserId());
    User newUser = repo.save(user2);
    return Optional.ofNullable(newUser);
  }

  @Override
  public boolean deleteUser(String id) {
    
    User user = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User Not found"));
    if (user != null) {
      repo.delete(user);
      return true;
    }
    else {
      return false;
    }
  }

  @Override
  public boolean isUserExist(String userId) {
    
    User user2 = repo.findById(userId).orElse(null);
    return user2 != null ? true : false;
  }

  @Override
  public boolean isUserExistByEmail(String email) {
    User user = repo.findByEmail(email).orElse(null);
    return user != null ? true : false;
  }

  @Override
  public List<User> getAllUsers() {
    
    return repo.findAll();
  }

@Override
public User getUserByEmail(String email) {
	
	return repo.findByEmail(email).orElse(null);
}

}
