package com.tomspencerlondon.social.data;

import com.tomspencerlondon.social.user.User;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class DataSource {
  private Map<String, User> userRepo = new HashMap<>();

  public User findUserByEmail(String email) {
    return userRepo.get(email);
  }

  public User saveUserByEmail(String email, User user) {
    userRepo.put(email, user);
    return user;
  }
}
